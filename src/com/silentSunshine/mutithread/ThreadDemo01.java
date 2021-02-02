package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/2 - 02 - 02 - 15:36
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo01 extends Thread{
    //创建线程的方式1：继承自Thread类，并重写run()方法
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("用户线程进行中："+i);
        }
    }

    public static void main(String[] args) {
        //创建线程对象
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        //启动线程，线程启动后不一定立即开始，取决于CPU
        threadDemo01.start();
        //用户线程和主线程是交替执行的
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程进行中："+i);
        }
    }
}
