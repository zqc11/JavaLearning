package com.silentsunshine.oop;

import com.silentsunshine.oop.demo2.Student;
import com.silentsunshine.oop.demo2.UserServiceImpl;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/17 - 01 - 17 - 9:19
 * @Description: com.silentsunshine.oop
 * @version: 1.0
 */
public class Application {
    public static void main(String[] args) {
        Student xiaohua;
        xiaohua = new Student("xiaohua", 20, 176.8f, "java");
        new Student("xiaohong", 20, 120f, "python").study();
        xiaohua.study();
        Student xio = new Student("table");
        xio.study();
        UserServiceImpl userService = new UserServiceImpl();
        try {
            userService.add();
            userService.delete();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }
}
