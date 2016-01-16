package nju.software.service;

import nju.software.dao.StudentDao;
import nju.software.dao.entity.StudentEntity;
import nju.software.service.convertor.StudentConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
@Service
public class StudentService {

    @Autowired
    StudentDao studentDao;

    public List<StudentModel> getAllStudents() {
        List<StudentEntity> studentEntities = studentDao.getAllStudents();
        return StudentConvertor.getModelsfromEntities(studentEntities);
    }

    public StudentModel getStudentByName(String name) {
        StudentEntity studentEntity = studentDao.getStudentByName(name);
        return StudentConvertor.getModelFromEntity(studentEntity);
    }

    public StudentModel getStudentById(int stuid) {
        StudentEntity studentEntity = studentDao.getStudentById(stuid);
        return StudentConvertor.getModelFromEntity(studentEntity);
    }


    public boolean createStudent(StudentModel studentModel) {
        StudentEntity studentEntity = StudentConvertor.getEntityFromModel(studentModel);
        return studentDao.createStudent(studentEntity);
    }

    public boolean updateStudent(StudentModel studentModel) {
        StudentEntity studentEntity = StudentConvertor.getEntityFromModel(studentModel);
        return studentDao.updateStudent(studentEntity);
    }

    public boolean deleteStudent(StudentModel studentModel) {
        StudentEntity studentEntity = StudentConvertor.getEntityFromModel(studentModel);
        return studentDao.deleteStudent(studentEntity);
    }

}
