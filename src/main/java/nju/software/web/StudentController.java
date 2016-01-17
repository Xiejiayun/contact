package nju.software.web;

import nju.software.service.StudentModel;
import nju.software.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        List<StudentModel> listUsers = studentService.getAllStudents();
        modelMap.put("userList", listUsers);
        return "student";
    }

    @RequestMapping(value = "/createStudent.do" , method = RequestMethod.GET)
    public String createStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String grade = request.getParameter("grade");
        int phone = Integer.parseInt(request.getParameter("phone"));

        StudentModel studentModel = new StudentModel(name, gender, grade, phone);
        return "student";
    }

    @RequestMapping(value = "/updateStudent.do" , method = RequestMethod.GET)
    public String updateStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        Map paraMap= request.getParameterMap();
        return "student";
    }

    @RequestMapping(value = "/deleteStudent.do" , method = RequestMethod.GET)
    public String deleteStudent(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        List<StudentModel> listUsers = studentService.getAllStudents();
        modelMap.put("userList", listUsers);
        return "student";
    }

}
