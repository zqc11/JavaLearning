package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 15:49
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo07 implements Runnable{
    private boolean flag;
    @Override
    public void run() {
        flag = true;
        int i=0;
        while (flag) {
            i++;
            System.out.println("用户线程："+i);
        }
    }

    public void stop() {
        flag = false;
    }

    public static void main(String[] args) {
        ThreadDemo07 threadDemo07 = new ThreadDemo07();
        new Thread(threadDemo07).start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程："+i);
            if (i == 500) {
                threadDemo07.stop();
            }
        }
    }
}
