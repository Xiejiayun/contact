package nju.software.service;

import nju.software.dao.StudentDao;
import nju.software.dao.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<StudentModel> getAllStudentModel() {
        List<StudentEntity> studentEntities = studentDao.getAllStudents();
        System.out.println();
        return new ArrayList<StudentModel>();
    }

//    public void setStudentDao(StudentDao studentDao) {
//        this.studentDao = studentDao;
//    }
}
