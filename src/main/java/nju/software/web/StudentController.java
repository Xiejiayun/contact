package nju.software.web;

import nju.software.dao.StudentDao;
import nju.software.dao.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
@Controller
public class StudentController {

        private StudentDao studentDao;

        @RequestMapping(value="/")
        public ModelAndView home() {
            List<StudentEntity> listUsers = studentDao.getAllStudents();
            ModelAndView model = new ModelAndView("home");
            model.addObject("userList", listUsers);
            return model;
        }

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
}
