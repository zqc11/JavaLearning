package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 14:52
 * @description practice com.silentsunshine.mutithread
 */
public class LambdaDemo {
    //静态内部类实现接口
    static class MyLike2 implements ILike{
        @Override
        public void lambda() {
            System.out.println("MyLike2:lambda()");
        }
    }
    public static void main(String[] args) {
        //普通类
        new MyLike().lambda();
        //静态内部类
        new MyLike2().lambda();

        //局部内部类实现接口
        class MyLike3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("MyLike3:lambda()");
            }
        }
        new MyLike3().lambda();

        //匿名内部类实现接口
        new ILike(){
            @Override
            public void lambda() {
                System.out.println("匿名内部类：lambda()");
            }
        }.lambda();

        //lambda表达式实现接口
        ILike iLike = ()-> System.out.println("lambda:lambda()");
        iLike.lambda();
        /*
        如有参数，将参数放入括号中，只有一个参数时，可以没有括号
        表达式比较简单时也可以省略大括号。
         */

    }
}

interface ILike {
    void lambda();
}

//普通类实现ILike接口
class MyLike implements ILike {
    @Override
    public void lambda() {
        System.out.println("MyLike:lambda()");
    }
}
