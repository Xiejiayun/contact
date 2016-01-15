package nju.software.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by lab on 16-1-15.
 */
@Entity
@Table(name = "ClaStuRelation")
public class ClaStuRelationEntity {
    private int classid;

    private int stuid;

    @Id
    @Column(name = "stuid")
    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
    @Id
    @Column(name = "classid")
    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
