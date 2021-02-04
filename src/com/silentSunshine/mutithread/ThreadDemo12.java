package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 10:32
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo12 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new God());
        thread1.setDaemon(true);  //默认为false，用户线程，设置为true，守护线程
        thread1.start();
        new Thread(new Human()).start();//用户线程启动
        //一旦用户线程死亡后，守护线程随之也会跟着死亡
    }
}

class God implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("上帝守护着你。");
        }
    }
}

class Human implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println("努力活着");
        }
    }
}