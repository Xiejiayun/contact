package nju.software.web;

import com.sun.xml.internal.ws.api.message.Message;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import nju.software.service.StudentModel;
import nju.software.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.util.List;
import java.util.Map;

/**
 * Created by lab on 16-1-15.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student.do" , method = RequestMethod.GET)
    public String student(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        try {
            List<StudentModel> listUsers = studentService.getAllStudents();
            modelMap.put("userList", listUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "student";
    }

    @RequestMapping(value = "/createStudent.do" , method = RequestMethod.POST)
    public String createStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        String username = request.getParameter("username");
        String gender = request.getParameter("gender");
        String grade = request.getParameter("grade");
        int phone = Integer.parseInt(request.getParameter("phone"));
        StudentModel studentModel = new StudentModel(username, gender, grade, phone);
        studentService.createStudent(studentModel);
        return "student";
    }

    @RequestMapping(value = "/updateStudent.do" , method = RequestMethod.POST)
    public String updateStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        String stuid = request.getParameter("stuid");
        StudentModel studentModel = studentService.getStudentById(Integer.parseInt(stuid));
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String grade = request.getParameter("grade");
        int phone = Integer.parseInt(request.getParameter("phone"));
        studentModel.setName(name);
        studentModel.setGender(gender);
        studentModel.setGrade(grade);
        studentModel.setPhone(phone);
        studentService.updateStudent(studentModel);
        return "student";
    }

    @RequestMapping(value = "/deleteStudent.do" , method = RequestMethod.POST)
    public void deleteStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        int stuid = Integer.parseInt(request.getParameter("stuid"));
        StudentModel studentModel = studentService.getStudentById(stuid);
        boolean success = studentService.deleteStudent(studentModel);
    }

}
