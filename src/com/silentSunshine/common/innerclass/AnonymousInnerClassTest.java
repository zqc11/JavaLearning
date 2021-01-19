package com.silentSunshine.common.innerclass;

/**
 * @auther: zhouqichun
 * @date: 2021/1/19 - 01 - 19 - 9:33
 * @description: com.silentSunshine.common.innerclass
 * @version: 1.0
 */
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass(){
            @Override
            void print() {
                System.out.println("使用匿名内部类，并重写方法");
            }
        };
        anonymousInnerClass.print();
    }
}
abstract class AnonymousInnerClass{
    abstract void print();
}
