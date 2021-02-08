package com.silentsunshine.iostream;

import java.io.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/7 - 02 - 07 - 15:59
 * @description practice com.silentsunshine.iostream
 */
public class TestObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("ObjectStream.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Student(10, "gaiya", 65.7));
        objectOutputStream.close();
        fileOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("ObjectStream.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.toString());
        objectInputStream.close();
        fileOutputStream.close();
    }
}
//Serializable标识这个类可以被序列化，为空接口
class Student implements Serializable {
    private int id;
    private String name;
    private double weight;
    public Student(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
    static final long serialVersionUID = 4937189730288740965L;


}