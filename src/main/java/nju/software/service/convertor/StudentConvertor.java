package nju.software.service.convertor;

import nju.software.dao.entity.StudentEntity;
import nju.software.service.StudentModel;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by lab on 16-1-16.
 */
public class StudentConvertor {

    public static StudentEntity getEntityFromModel(StudentModel studentModel) {
        StudentEntity studentEntity = new StudentEntity();
        try {
            BeanUtils.copyProperties(studentEntity, studentModel);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return studentEntity;
    }

    public static StudentModel getModelFromEntity(StudentEntity studentEntity) {
        StudentModel studentModel = new StudentModel();
        try {
            BeanUtils.copyProperties(studentModel, studentEntity);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return studentModel;
    }

    public static void main(String[] args) {
        StudentModel studentModel = new StudentModel("xie","male","8",10086);
        StudentEntity studentEntity = StudentConvertor.getEntityFromModel(studentModel);
        System.out.println(studentEntity.toString());
        StudentModel model = StudentConvertor.getModelFromEntity(studentEntity);
        System.out.println(model.toString());
    }
}
