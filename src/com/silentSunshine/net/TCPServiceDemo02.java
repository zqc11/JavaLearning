package com.silentsunshine.net;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 16:07
 * @description practice com.silentsunshine.net
 */
public class TCPServiceDemo02 {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9000);
        Socket accept = serverSocket.accept();
        InputStream is = accept.getInputStream();
        byte[] buffer = new byte[1024];
        int length;
        File file = new File("recieve.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        while ((length = is.read(buffer)) != - 1) {
            fileOutputStream.write(buffer);
        }
        OutputStream os2 = accept.getOutputStream();
        os2.write("我已接收完毕，你可以断开了。".getBytes(StandardCharsets.UTF_8));
        accept.shutdownOutput();
        os2.close();
        fileOutputStream.close();
        is.close();
        accept.close();
        serverSocket.close();
    }
}
