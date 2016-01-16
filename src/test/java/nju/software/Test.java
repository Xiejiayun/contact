package nju.software;

import nju.software.dao.StudentDao;
import nju.software.dao.entity.StudentEntity;
import nju.software.service.StudentModel;
import nju.software.service.convertor.StudentConvertor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by lab on 16-1-16.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
                //new XmlWebApplicationContext();
        StudentDao studentDao = (StudentDao) context.getBean("studentDao");
//        List<StudentEntity> studentEntityList = studentDao.getAllStudents();
//        for (StudentEntity student : studentEntityList
//             ) {
//            String name = student.getName();
//            System.out.println(name);
//        }
//        StudentModel studentModel = new StudentModel("xie","male","8",10086);
//        StudentEntity studentEntity = StudentConvertor.getEntityFromModel(studentModel);
//        studentDao.createStudent(studentEntity);

        StudentEntity studentEntity = studentDao.getStudentById(14);
        studentDao.deleteStudent(studentEntity);
        studentDao.deleteStudent(studentDao.getStudentById(15));

    }
}
