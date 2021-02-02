package com.silentsunshine.mutithread;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/2 - 02 - 02 - 16:01
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo02 extends Thread{
    private String url;
    private String fileName;
    public ThreadDemo02(String url, String fileName){
        this.url = url;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        new WebDownload(url, fileName);
        System.out.println("图片下载完成");
    }

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            ThreadDemo02 threadDemo02 = new ThreadDemo02(String.format("https://www.kuangstudy.com/assert/images/bg/%d.jpg", i),
                    String.format("picture%d.jpg", i));
            threads.add(threadDemo02);
        }
        for (Thread thread : threads) {
            thread.start();
        }
        System.out.println("下载开始！");
    }
}

class WebDownload {
    public WebDownload(String url, String fileName) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，WebDownload发生错误。");
        }
    }
}
