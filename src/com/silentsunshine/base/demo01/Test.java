package com.silentsunshine.base.demo01;

/**
 * @auther: zhouqichun
 * @date: 2021/1/17 - 01 - 17 - 17:15
 * @description: com.silentsunshine.base.demo01
 * @version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        Father son = new Son();
        son.eat();
        son.go();
        int[][] a = new int[2][2];
        System.out.println(a.length);

    }
}
class Father{
     void eat(){
        System.out.println("iAmDad");
    }
    public static void go(){
        System.out.println("father");
    }
}
class Son extends Father{
    public void eat(){
        System.out.println("iAmSon");
    }
    public static void go(){
        System.out.println("son");
    }
}