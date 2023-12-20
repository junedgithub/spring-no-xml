package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestStudent {
    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Student student = (Student) configurableApplicationContext.getBean("student");
        System.out.println(student.age);
    }
}
