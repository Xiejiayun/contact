package nju.software.service;

/**
 * Created by lab on 16-1-15.
 */
public class StudentModel {

    private int stuid;
    private String name;
    private String gender;
    private String grade;
    private Integer phone;

    public StudentModel() {
    }

    public StudentModel(String name, String gender, String grade, Integer phone) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.phone = phone;
    }

    public StudentModel(int stuid, String name, String gender, String grade, Integer phone) {
        this.stuid = stuid;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.phone = phone;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "stuid=" + stuid +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", phone=" + phone +
                '}';
    }
}
