package com.silentsunshine.mutithread;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 18:10
 * @description practice com.silentsunshine.mutithread
 */
public class TestExcuteService {
    public static void main(String[] args) {
        ExecutorService service = newFixedThreadPool(10);
        ThreadTest threadTest = new ThreadTest();
        service.execute(threadTest);
        service.execute(threadTest);
        service.execute(threadTest);
        service.execute(threadTest);
        service.shutdown();
    }
}

class ThreadTest implements Runnable {
    @Override
    public void run() {
        System.out.println("线程开始");
    }
}
