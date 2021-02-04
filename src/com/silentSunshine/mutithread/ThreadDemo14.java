package com.silentsunshine.mutithread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 11:34
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo14 {
    //不安全的并发测试
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
