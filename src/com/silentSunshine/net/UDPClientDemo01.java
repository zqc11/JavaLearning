package com.silentsunshine.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 21:26
 * @description practice com.silentsunshine.net
 */
public class UDPClientDemo01 {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket();
        String msg = "你好,服务器";
        InetAddress host = InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8),
                msg.getBytes(StandardCharsets.UTF_8).length, host, 9090);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
