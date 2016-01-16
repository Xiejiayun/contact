package nju.software;

import nju.software.dao.StudentDao;
import nju.software.dao.StudentEntity;
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
        List<StudentEntity> studentEntityList = studentDao.getAllStudents();
        for (StudentEntity student : studentEntityList
             ) {
            String name = student.getName();
            System.out.println(name);
        }
    }
}
