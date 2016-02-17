package nju.software.service;

import com.google.code.ssm.api.ParameterValueKeyProvider;
import com.google.code.ssm.api.ReadThroughAssignCache;
import com.google.code.ssm.api.ReadThroughSingleCache;
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

    @ReadThroughAssignCache(assignedKey = "StudentModel/getAllStudents", namespace = "StudentModel", expiration = 60)
    public List<StudentModel> getAllStudents() {
        List<StudentEntity> studentEntities = studentDao.getAllStudents();
        return StudentConvertor.getModelsfromEntities(studentEntities);
    }

    @ReadThroughSingleCache(namespace = "StudentModel", expiration = 60)
    public StudentModel getStudentByName(@ParameterValueKeyProvider String name) {
        StudentEntity studentEntity = studentDao.getStudentByName(name);
        return StudentConvertor.getModelFromEntity(studentEntity);
    }

    @ReadThroughSingleCache(namespace = "StudentModel", expiration = 60)
    public StudentModel getStudentById(@ParameterValueKeyProvider int stuid) {
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
