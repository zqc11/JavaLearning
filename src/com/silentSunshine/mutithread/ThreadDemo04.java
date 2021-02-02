package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/2 - 02 - 02 - 22:55
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo04 implements Runnable{
    private int ticketNums = 30;
    @Override
    public void run() {
        while (ticketNums>=0) {
            try {
                ThreadDemo02.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"抢到了第"+ticketNums--+"张票。");
        }
    }

    public static void main(String[] args) {
        //多线程操作同一资源会出现并发问题
        ThreadDemo04 threadDemo04 = new ThreadDemo04();
        new Thread(threadDemo04, "小明").start();
        new Thread(threadDemo04, "小花").start();
        new Thread(threadDemo04, "晓东").start();
        new Thread(threadDemo04, "黄牛").start();
        new Thread(threadDemo04, "大皮").start();

    }
}
