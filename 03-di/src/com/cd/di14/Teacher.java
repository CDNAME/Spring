package com.cd.di14;

public class Teacher {
    private String name;
    private int workAge;    //教龄
    private String school;  //学校
    private String department;  //院系

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", workAge=" + workAge +
                ", school='" + school + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
