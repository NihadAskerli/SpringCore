package com.example.springxml;

import beans.User;
import dao.UserDAOInter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringXmlApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringXmlApplication.class, args);
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringBeans.xml");
//        User obj=(User) context.getBean("user");
//        obj.printHello();
        UserDAOInter obj=(UserDAOInter) context.getBean("userDao");// burada dependency injeksin bas verir


    }

}
