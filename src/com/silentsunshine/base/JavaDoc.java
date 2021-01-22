package com.silentsunshine.base;

/**
 * @Auther: zhouqc
 * @Date: 2021/1/16 - 01 - 16 - 10:46
 * @Description: com.silentsunshine.base
 * @version: 1.0
 */
public class JavaDoc {
    public String name;

    /**
     * this is a test
     * @param name
     * @return
     */
    public String test(String name){
        return name;
    }

    public static void main(String[] args) {
        JavaDoc javaDoc = new JavaDoc();
        javaDoc.name = "hello";
        System.out.println(javaDoc.test(javaDoc.name));
    }
}
