package com.silentsunshine.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 21:26
 * @description practice com.silentsunshine.net
 */
public class UDPServiceDemo01 {
    public static void main(String[] args) throws Exception{
        DatagramSocket datagramSocket = new DatagramSocket(9090);
        byte[] buffer = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(buffer, 0, buffer.length);
        datagramSocket.receive(datagramPacket);
        System.out.println(datagramPacket.getAddress().getHostAddress());
        System.out.println(new String(datagramPacket.getData()));
        datagramSocket.close();
    }
}
