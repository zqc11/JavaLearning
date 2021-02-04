package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 15:32
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo15 {
    //死锁测试
    /*
    死锁的四个必要条件
    1. 互斥条件
    2. 不剥夺条件
    3. 循环等待条件
    4. 请求与保持条件
     */
    public static void main(String[] args) {
        MakeUp girl1 = new MakeUp("灰姑娘", 0);
        MakeUp girl2 = new MakeUp("白雪公主", 1);
        new Thread(girl1).start();
        new Thread(girl2).start();

    }
}

class LickStick {

}

class Mirror {

}

class MakeUp extends Thread {
    private static LickStick lickStick = new LickStick();
    private static Mirror mirror = new Mirror();
    private String girlName;
    private int choice;
    public MakeUp(String girlName,int choice) {
        this.girlName = girlName;
        this.choice = choice;
    }
    @Override
    public void run() {
        if (choice == 0) {
            synchronized (lickStick) {
                System.out.println(girlName + "获得了lickStick的锁");
                try {
                    Thread.sleep(1000);
                    synchronized (mirror) {
                        System.out.println(girlName + "获得了mirror的锁");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            synchronized (mirror) {
                System.out.println(girlName + "获得了mirror的锁");
                try {
                    Thread.sleep(2000);
                    synchronized (lickStick) {
                        System.out.println(girlName + "获得了lickStick的锁");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
}
}