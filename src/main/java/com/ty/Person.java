package com.ty;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
    int age;

    public Person(@Value(value = "90") int age) {
        this.age = age;
    }

    public void run(){
        System.out.println("Person is Runing...");
    }
}
