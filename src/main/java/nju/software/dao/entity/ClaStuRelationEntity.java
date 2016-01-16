package nju.software.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by lab on 16-1-15.
 */
@Entity
@Table(name = "ClaStuRelation")
public class ClaStuRelationEntity implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClaStuRelationEntity that = (ClaStuRelationEntity) o;

        if (classid != that.classid) return false;
        return stuid == that.stuid;

    }

    @Override
    public int hashCode() {
        int result = classid;
        result = 31 * result + stuid;
        return result;
    }

    @Override
    public String toString() {
        return "ClaStuRelationEntity{" +
                "classid=" + classid +
                ", stuid=" + stuid +
                '}';
    }
}
