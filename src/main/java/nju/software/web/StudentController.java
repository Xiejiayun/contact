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

/**
 * Created by lab on 16-1-15.
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(name = "/student.do" , method = RequestMethod.GET)
    public String base(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        List<StudentModel> listUsers = studentService.getAllStudents();
        modelMap.put("userList", listUsers);
        return "student";
    }

}
