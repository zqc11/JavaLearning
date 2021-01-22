package com.silentsunshine.common.innerclass;

/**
 * @auther: zhouqichun
 * @date: 2021/1/19 - 01 - 19 - 8:12
 * @description: com.silentsunshine.common.innerclass
 * @version: 1.0
 */
public class PartialClassTest {
    private static String string = "hello";
    
    public static void main(String[] args) {
        //先定义在使用，如果在使用后面定义，会报错
        int Apple = 1;
        //Apple = 2; Error

        //局部内部类：定义在块中，即定义在{}中
        class PartialClass{
            public void print(){
                System.out.println("i Am A PartialClass");
                //局部类引用局部变量，局部变量必须为final
                System.out.println("局部变量 Apple = "+Apple);
                //在main中可以访问外围类字段，不过必须为静态字段
                System.out.println("PartialClassTest.string = " + string);
            }
        }
        //创建局部类对象
        PartialClass partialClass = new PartialClass();
        partialClass.print();
    }
}
