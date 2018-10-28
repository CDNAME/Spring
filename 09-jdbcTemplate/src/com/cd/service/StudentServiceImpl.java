package com.cd.service;

import com.cd.beans.Student;
import com.cd.dao.IStudentDao;

import java.util.List;

public class StudentServiceImpl implements IStudentService {
    
    private IStudentDao dao;

    public void setDao(IStudentDao dao) {
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
        return dao.selectAllStudentNames();
    }

    @Override
    public String findStudentNameById(int id) {
        return dao.selectStudentNameById(id);
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
