package com.silentSunshine.oop.demo2;

import com.silentSunshine.oop.demo1.Person;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/17 - 01 - 17 - 9:18
 * @Description: com.silentSunshine.oop.demo2
 * @version: 1.0
 */
public class Student extends Person {
    private String subject;
    private String hobby;

    public Student() {
    }

    public Student(String name, int age, float height, String subject) {
        super(name, age, height);
        this.subject = subject;
    }

    public Student(String hobby) {
        this.hobby = hobby;
    }

    public void study(){
        System.out.println("I'm " + this.getName() + " , i study " + this.subject);
    }
}
