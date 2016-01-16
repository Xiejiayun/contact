package nju.software.dao.entity;

import javax.persistence.*;

/**
 * Created by lab on 16-1-15.
 */
@Entity
@Table(name = "Class")
public class ClassroomEntity {
    private int classid;
    private String classroom;
    private String description;

    @Id
    @Column(name = "classid")
    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    @Basic
    @Column(name = "classroom")
    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClassroomEntity that = (ClassroomEntity) o;

        if (classid != that.classid) return false;
        if (classroom != null ? !classroom.equals(that.classroom) : that.classroom != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = classid;
        result = 31 * result + (classroom != null ? classroom.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClassroomEntity{" +
                "classid=" + classid +
                ", classroom='" + classroom + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
