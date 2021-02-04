package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 17:28
 * @description practice com.silentsunshine.mutithread
 */
//生产者消费者模型：标志位法
public class TestRGLight {
    public static void main(String[] args) {
        TV tv = new TV();
        Actor actor = new Actor(tv);
        Audience audience = new Audience(tv);
        new Thread(actor).start();
        new Thread(audience).start();
    }
}

class TV {
    String voice;
    boolean flag = false;
    public synchronized void play(String voice) {
        if (flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("演员表演了:"+voice);
        this.voice = voice;
        flag = !flag;
        this.notifyAll();
    }

    public synchronized void watch() {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("观众观看了："+voice);
        flag = !flag;
        this.notifyAll();
    }
}
class Actor implements Runnable {
    TV tv;
    public Actor(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        String voice;
        for (int i=0; i<20; i++) {
            if (i % 3 == 0) {
                voice = "凡人修仙传";
            } else {
                voice = "贪婪蓝月";
            }
            tv.play(voice);
        }
    }
}
class Audience implements Runnable {
    TV tv;

    public Audience(TV tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i=0; i<20; i++) {
            tv.watch();
        }
    }
}
