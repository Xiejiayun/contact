package nju.software.web;

import nju.software.dao.StudentDao;
import nju.software.dao.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by lab on 16-1-16.
 */
@Controller
public class BaseController {

    StudentDao studentDao;

    @RequestMapping(name = "/base.do" , method = RequestMethod.GET)
    public String base(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        List<StudentEntity> listUsers = studentDao.getAllStudents();
        modelMap.put("userList", listUsers);
        return "home";
    }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
