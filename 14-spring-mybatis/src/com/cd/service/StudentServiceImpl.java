package com.cd.service;

import com.cd.beans.Student;
import com.cd.dao.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    
    private StudentDao dao;

    public void setDao(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    public void addStudent(Student student) {
        dao.insertStudent(student);
    }

    @Override
    public void removeById(int id) {
        dao.deleteById(id);
    }

    @Override
    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    @Override
    public List<String> findAllStudentNames() {
        List<String> names = new ArrayList<>();
        List<Student> students = this.findAllStudent();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    @Override
    public String findStudentNameById(int id) {
        Student student = this.findStudentById(id);
        return student.getName();
    }

    @Override
    public List<Student> findAllStudent() {
        return dao.selectAllStudent();
    }

    @Override
    public Student findStudentById(int id) {
        return dao.selectStudentById(id);
    }
}
