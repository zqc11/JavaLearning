package com.silentsunshine.common.string;

/**
 * @author zhouqichun
 * @auther: zhouqichun
 * @date: 2021/1/21 - 01 - 21 - 10:01
 * @description: com.silentsunshine.common.string
 * @version: 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        char[] array = {'d', 'e', 'f'};
        //new关键字，堆内存新分配内存
        String s = new String(array);
        System.out.println(s);
        //常量池新分配内存
        String s1 = "def";
        //常量池已存在该字面量，访问常量池存在的对象
        String s2 = "def";
        System.out.println(s1);
        System.out.println("s==s1:"+ (s==s1));//false
        System.out.println("s1==s2:" + (s1==s2));//true
        //new关键字，堆内存创建
        String s3 = new String(s1);
        System.out.println("s1==s3:" + (s1==s3));//false
        System.out.println("s1.equals(s3):" + s1.equals(s3));//true

        String s4 = new String(new int[]{1,2,97,99,101}, 2, 3);
        System.out.println(s4);
        //返回index处字符的代码点值
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.subSequence(0, 2));
        String s5 = "                fssfsf         ";
        System.out.println(s5);
        //去掉前导和后导的空格
        System.out.println(s5.trim());
        //重复
        System.out.println(s1.repeat(7));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("hello");
        stringBuffer.append(" world");
        System.out.println(stringBuffer);
        System.out.format("%d %f", 20, 20.1f);
    }
}
