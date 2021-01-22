package com.silentsunshine.common.object;

import com.silentsunshine.oop.demo1.Person;

/**
 * @author zhouqichun
 * @auther: zhouqichun
 * @date: 2021/1/20 - 01 - 20 - 21:26
 * @description: com.silentsunshine.common.object
 * @version: 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Person person1 = new Person("lihua", 20, 132.5f);
        Person person2 = new Person("lihua", 20, 132.5f);
        //获得一个对象的字符串表示
        System.out.println(o1.toString());//java.lang.Object@hashCode
        System.out.println(person1.toString());
        //获得当前对象的类
        System.out.println(person1.getClass());
        //默认比较内存地址
        System.out.println(o1.equals(o2));//false
        System.out.println(person1.equals(person2));//true
    }

}
