package com.silentsunshine.net;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 22:24
 * @description practice com.silentsunshine.net
 */
public class Application1 {
    public static void main(String[] args) {
        new Thread(new ChatSend(9123, "localhost", 6588)).start();
        new Thread(new ChatRecieve(9124)).start();
    }
}
