package com.ty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestTeacher {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Teacher teacher = (Teacher) applicationContext.getBean("teacher");
        System.out.println(teacher.age);
    }
}
