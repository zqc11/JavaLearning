package com.silentsunshine.mutithread;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 9:56
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo10 {
    public static void main(String[] args) {
        timeDown();
    }

    public static void timeDown() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (int i = 0; i < 60; i++) {
            date.setTime(System.currentTimeMillis());
            System.out.println(format.format(date));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
