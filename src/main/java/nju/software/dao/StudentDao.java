package nju.software.dao;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
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
}
