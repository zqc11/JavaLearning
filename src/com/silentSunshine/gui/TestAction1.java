package com.silentsunshine.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/15 - 02 - 15 - 15:10
 * @description practice com.silentsunshine.gui
 */
public class TestAction1 {
    public static void main(String[] args) {
        Frame frame  = new Frame("开始-结束");
        Button startButton = new Button("start");
        Button stopButton = new Button("stop");
        MyAction myAction = new MyAction(frame);
        startButton.addActionListener(myAction);
        stopButton.addActionListener(myAction);
        frame.add(startButton, BorderLayout.NORTH);
        frame.add(stopButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setVisible(true);
        windowsClose(frame);
    }

    private static void windowsClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

class MyAction implements ActionListener {
    Frame frame;

    public MyAction(Frame frame) {
        this.frame = frame;
    }
    @Override

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("start")) {
            System.out.println("startButton Run.");
        } else {
            System.exit(0);
        }
    }
}
