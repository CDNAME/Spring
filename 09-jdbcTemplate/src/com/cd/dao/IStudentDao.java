package com.cd.dao;

import com.cd.beans.Student;

import java.util.List;

public interface IStudentDao {
    void insertStudent(Student student);
    void deleteById(int id);
    void updateStudent(Student student);

    List<String> selectAllStudentNames();
    String selectStudentNameById(int id);

    List<Student> selectAllStudent();
    Student selectStudentById(int id);
}
