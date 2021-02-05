package com.silentsunshine.net;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 22:24
 * @description practice com.silentsunshine.net
 */
public class Application2 {
    public static void main(String[] args) {
        new Thread(new ChatSend(6587, "localhost", 9124)).start();
        new Thread(new ChatRecieve(6588)).start();
    }
}
