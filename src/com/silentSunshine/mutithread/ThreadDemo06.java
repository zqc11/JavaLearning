package com.silentsunshine.mutithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import static java.util.concurrent.Executors.newFixedThreadPool;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 10:25
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo06 implements Callable {
    //创建多线程方式3：实现Callable接口
    //重写call方法
    @Override
    public String call() throws Exception {
        return "Success";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建线程对象
        ThreadDemo06 threadDemo061 = new ThreadDemo06();
        ThreadDemo06 threadDemo062 = new ThreadDemo06();
        ThreadDemo06 threadDemo063 = new ThreadDemo06();
        //创建执行服务
        ExecutorService executorService = newFixedThreadPool(3);
        //提交执行
        Future submit1 = executorService.submit(threadDemo061);
        Future submit2 = executorService.submit(threadDemo061);
        Future submit3 = executorService.submit(threadDemo061);
        //获取结果
        String t1 = (String) submit1.get();
        String t2 = (String) submit1.get();
        String t3 = (String) submit1.get();
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        //关闭服务
        executorService.shutdown();
    }
}
