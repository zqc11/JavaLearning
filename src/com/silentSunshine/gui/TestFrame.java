package com.silentsunshine.gui;

import java.awt.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/9 - 02 - 09 - 17:14
 * @description practice com.silentsunshine.gui
 */
public class TestFrame {
    public static void main(String[] args) {
        new MyFrame(100, 100, 200, 200);
        new MyFrame(100, 300, 200, 200);
        new MyFrame(300, 100, 200, 200);
        new MyFrame(300, 300, 200, 200);
    }
}

class MyFrame extends Frame {
    private static int id = 0;

    public MyFrame(int x, int y, int height, int wight) {
        this.setBounds(x, y, wight, height);
        this.setTitle(String.format("Window-%d", id++));
        this.setResizable(false);
        this.setBackground(Color.pink);
        this.setVisible(true);
    }
}
