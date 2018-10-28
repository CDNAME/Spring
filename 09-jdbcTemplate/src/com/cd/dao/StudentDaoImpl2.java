package com.cd.dao;

import com.cd.beans.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

//JdbcTemplate对象是多例的,方法执行结束后，会自动释放JdbcTemplate实例，所以代码不可以写成下面的形式，会报NullPointer
public class StudentDaoImpl2 extends JdbcDaoSupport implements IStudentDao {
    private JdbcTemplate jt;

    public StudentDaoImpl2() {
        jt = this.getJdbcTemplate();
    }

    @Override
    public void insertStudent(Student student) {
        String sql = "insert into student(name,age) values(?,?)";
        jt.update(sql, student.getName(), student.getAge());
    }

    @Override
    public void deleteById(int id) {
        String sql = "delete from student where id=?";
        jt.update(sql, id);
    }

    @Override
    public void updateStudent(Student student) {
        String sql = "update student set name=?, age=? where id=?";
        jt.update(sql, student.getName(), student.getAge(), student.getId());
    }

    @Override
    public List<String> selectAllStudentNames() {
        String sql = "select name from student";
        return jt.queryForList(sql, String.class);
    }

    @Override
    public String selectStudentNameById(int id) {
        String sql = "select name from student where id=?";
        return jt.queryForObject(sql, String.class, id);
    }

    @Override
    public List<Student> selectAllStudent() {
        String sql = "select id,name,age from student";
        return jt.query(sql, new StudentRowMapper());
    }

    @Override
    public Student selectStudentById(int id) {
        String sql = "select id,name,age from student where id=?";
        return jt.queryForObject(sql, new StudentRowMapper(), id);
    }
}
