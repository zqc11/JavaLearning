package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 16:59
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo09 {
    //线程的五大状态:
    //新生、就绪、运行、堵塞、死亡
    public static void main(String[] args) {
        Runnable target;
        Thread thread = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("User thread");
            }
        });
        Thread.State state = thread.getState();
        System.out.println(state);
        thread.start();
        System.out.println(thread.getState());
        while (thread.getState() != Thread.State.TERMINATED) {
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
        //thread.start() error
    }
}
