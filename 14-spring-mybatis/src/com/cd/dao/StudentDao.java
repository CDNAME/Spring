package com.cd.dao;

import com.cd.beans.Student;

import java.util.List;

public interface StudentDao {
    void insertStudent(Student student);
    void deleteById(int id);
    void updateStudent(Student student);

    List<Student> selectAllStudent();
    Student selectStudentById(int id);
}
