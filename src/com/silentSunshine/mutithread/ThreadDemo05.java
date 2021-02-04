package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 9:56
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race, "兔子").start();
        new Thread(race, "乌龟").start();
    }
}

class Race implements Runnable {
    private final int distance = 200;
    private String winner;
    @Override
    public void run() {

        for (int i = 1; i <= distance; i++) {
            if (isGameOver(i)) {
                break;
            }
            if (Thread.currentThread().getName().equals("兔子")&&i==100) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"跑了"+i+"步");
        }
    }
    private boolean isGameOver(int step){
        if (winner != null) {
            return true;
        } else {
            if (step >= distance) {
                winner = Thread.currentThread().getName();
                System.out.println("Winner is "+winner);
                return true;
            }
            return false;
        }
    }
}