package com.cd.service;

import com.cd.beans.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    void removeById(int id);
    void modifyStudent(Student student);
    
    List<String> findAllStudentNames();
    String findStudentNameById(int id);
    
    List<Student> findAllStudent();
    Student findStudentById(int id);
}
