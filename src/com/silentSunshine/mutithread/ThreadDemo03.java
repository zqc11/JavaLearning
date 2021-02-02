package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/2 - 02 - 02 - 22:44
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo03 implements Runnable{
    //实现多线程方式2：实现Runnable接口
    //重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("我使用Runnable实现多线程-"+i);
        }
    }

    public static void main(String[] args) {
        //将实现了Runnable接口的具体类传入Thread
        new Thread(new ThreadDemo03()).start();;
        for (int i = 0; i < 300; i++) {
            System.out.println("主线程执行-"+i);
        }
    }
}
