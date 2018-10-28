package com.cd.servlet;

import com.cd.beans.Student;
import com.cd.service.IStudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="register", urlPatterns="/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        Student student = new Student(name, age);
        
        /*
        //获取Spring容器对象 方法一
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        */
        
        /*
        //获取Spring容器对象 方法二
        String acKey = WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE;
        ApplicationContext ac = (ApplicationContext) this.getServletContext().getAttribute(acKey);
        */
        
        //获取Spring容器对象 方法三
        WebApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
        //System.out.println("ac = " + ac);
        //从Spring容器中获取到Service对象
        IStudentService service = (IStudentService) ac.getBean("service");
        //调用Service的addStudent()完成插入
        service.addStudent(student);
        
        request.getRequestDispatcher("/welcome.jsp").forward(request,response);
    }
}
