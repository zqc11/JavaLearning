package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 10:17
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo11 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"-->"+
                Thread.currentThread().getPriority());
        Priority priority = new Priority();
        Thread thread0 = new Thread(priority);
        Thread thread1 = new Thread(priority);
        Thread thread2 = new Thread(priority);
        Thread thread3 = new Thread(priority);
        Thread thread4 = new Thread(priority);
        Thread thread5 = new Thread(priority);


        thread1.setPriority(1);

        thread2.setPriority(4);

        thread3.setPriority(10);

        //thread4.setPriority(11);

        //thread5.setPriority(-1);

        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}

class Priority implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+
                Thread.currentThread().getPriority());
    }
}