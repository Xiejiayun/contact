package nju.software.dao;

import nju.software.dao.entity.StudentEntity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lab on 16-1-15.
 */
@Component
public class StudentDao extends HibernateDaoSupport {

    static Logger logger = LogManager.getLogger(StudentDao.class);
     /**
     * get all the student from the database
     * @return
     */
    public List<StudentEntity> getAllStudents() {
        logger.info("getAllStudents");
        List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        List list = getHibernateTemplate().find("from StudentEntity");
        if (list != null)
            studentEntities = (List<StudentEntity>) list;
        return studentEntities;
    }

    public StudentEntity getStudentByName(String name) {
        logger.info("getStudentByName name=" + name );
        List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        List list = getHibernateTemplate().find("from StudentEntity");
        if (list != null)
            studentEntities = (List<StudentEntity>) list;
        return studentEntities.size() == 0 ? null : studentEntities.get(0);
    }

    public StudentEntity getStudentById(int stuid) {
        logger.info("getStudentById id="+stuid);
        List<StudentEntity> studentEntities = new ArrayList<StudentEntity>();
        List list = getHibernateTemplate().find("from StudentEntity where stuid=?", stuid);
        if (list != null)
            studentEntities = (List<StudentEntity>) list;
        return studentEntities.size() == 0 ? null : studentEntities.get(0);
    }


    public boolean createStudent(StudentEntity studentEntity) {
        logger.info("createStudent");
        try {
            getHibernateTemplate().evict(studentEntity);
            getHibernateTemplate().save(studentEntity);
        } catch (Exception e) {
            logger.error("add student exception", e);
            return false;
        }
        return true;
    }

    public boolean updateStudent(StudentEntity studentEntity) {
        logger.info("updateStudent");
        try {
            getHibernateTemplate().evict(studentEntity);
            getHibernateTemplate().update(studentEntity);
        } catch (Exception e) {
            logger.error("update student exception", e);
            return false;
        }
        return true;
    }

    public boolean deleteStudent(StudentEntity studentEntity) {
        logger.info("deleteStudent");
        try {
            getHibernateTemplate().delete(studentEntity);
        } catch (Exception e) {
            logger.error("delete student exception", e);
            return false;
        }
        return true;
    }

}
