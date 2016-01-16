package nju.software.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
@Component
public class StudentDao extends HibernateDaoSupport {

    /**
     * get all the student from the database
     * @return
     */
    public List<StudentEntity> getAllStudents() {
        List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        List list = getHibernateTemplate().find("from StudentEntity");
        if (list != null)
            studentEntities = (List<StudentEntity>) list;
        return studentEntities;
    }

    public StudentEntity getStudentByName(String name) {
        List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        List list = getHibernateTemplate().find("from StudentEntity");
        if (list != null)
            studentEntities = (List<StudentEntity>) list;
        return studentEntities.size() == 0 ? null : studentEntities.get(0);
    }
}
