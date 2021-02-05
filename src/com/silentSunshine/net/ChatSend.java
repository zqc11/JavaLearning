package com.silentsunshine.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/5 - 02 - 05 - 22:18
 * @description practice com.silentsunshine.net
 */
public class ChatSend implements Runnable{
    private DatagramSocket datagramSocket;
    private DatagramPacket datagramPacket;
    private BufferedReader reader;
    private InetAddress toIP;
    private int toPort;
    private byte[] containers;
    private String sendMsg;

    public ChatSend(int fromPort, String toIP, int toPort) {
        try {
            datagramSocket = new DatagramSocket(fromPort);
            this.toIP = InetAddress.getByName(toIP);
            this.toPort = toPort;
            containers = new byte[1024];
            this.reader = new BufferedReader(new InputStreamReader(System.in));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

        while (true) {
            try {
                sendMsg = reader.readLine();
                containers = sendMsg.getBytes(StandardCharsets.UTF_8);
                datagramPacket = new DatagramPacket(containers, 0, containers.length, this.toIP, this.toPort);
                datagramSocket.send(datagramPacket);
                if (sendMsg.equals("bye")) {
                    break;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            reader.close();
            datagramSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
