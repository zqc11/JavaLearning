package com.silentsunshine.net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 10:45
 * @description practice com.silentsunshine.net
 */
public class TCPClientDemo01 {
    public static void main(String[] args) {
        Socket socket = null;
        OutputStream outputStream = null;

        try {
            //服务器端地址
            InetAddress serverIP = InetAddress.getByName("localhost");
            int port = 9999;
            //创建一个Socket连接
            socket = new Socket(serverIP,port);
            //发送消息
            outputStream = socket.getOutputStream();
            outputStream.write("我在学习Java网络编程".getBytes(StandardCharsets.UTF_8));


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
