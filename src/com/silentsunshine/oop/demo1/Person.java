package com.silentsunshine.oop.demo1;

import java.util.Objects;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/17 - 01 - 17 - 9:11
 * @Description: com.silentsunshine.oop
 * @version: 1.0
 */
public class Person {
    private String name;
    private int age;
    private float height;

    public Person(String lihua) {
        String name = lihua;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && Float.compare(person.getHeight(), getHeight()) == 0 && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getHeight());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 0){
            this.age = 3;
        }
        else {
            this.age = age;
        }
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 300.0 || height < 0.0) {
            this.height = 140;
        }
        else {
            this.height = height;
        }
    }
}
