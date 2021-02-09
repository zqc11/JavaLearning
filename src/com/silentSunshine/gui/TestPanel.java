package com.silentsunshine.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/9 - 02 - 09 - 17:25
 * @description practice com.silentsunshine.gui
 */
public class TestPanel {
    public static void main(String[] args) {
        MyFrame frame = new MyFrame(100, 100, 500, 500);
        frame.setLayout(null);
        //创建面板
        Panel panel = new Panel();
        panel.setBackground(Color.BLACK);
        panel.setBounds(20, 20, 100, 100);
        panel.setVisible(true);
        //添加组件
        frame.add(panel);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
