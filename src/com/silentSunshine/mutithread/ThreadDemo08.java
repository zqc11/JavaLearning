package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 15:58
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo08 implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<=500; i++) {
            System.out.println("vip"+i);
        }
    }

    public static void main(String[] args) {
        ThreadDemo08 threadDemo08 = new ThreadDemo08();
        Thread thread = new Thread(threadDemo08);
        thread.start();
        for (int i = 0; i < 1000; i++) {
            if (i == 500) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main "+i);
        }
    }
}
