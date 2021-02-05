package com.silentsunshine.net;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 10:45
 * @description practice com.silentsunshine.net
 */
public class TCPServiceDemo01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //生成服务端地址
            serverSocket = new ServerSocket(9999);
            //等待连接
            socket = serverSocket.accept();
            inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int length;
            /*while ((length = inputStream.read(buffer)) != - 1) {
                String msg = new String(buffer, 0, length);
                System.out.println(msg);
            }*/
            byteArrayOutputStream = new ByteArrayOutputStream();
            while ((length = inputStream.read(buffer)) != - 1) {
                byteArrayOutputStream.write(buffer, 0, length);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
