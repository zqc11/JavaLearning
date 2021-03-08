package com.silentsunshine.gui;

import com.silentsunshine.gui.lib.WindowsCloseAction;

import java.awt.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/16 - 02 - 16 - 21:46
 * @description practice com.silentsunshine.gui
 */
public class TestPaint {
    public static void main(String[] args) {
        new MyFrame3();
    }
}

class MyFrame3 extends Frame {
    public MyFrame3() {
        this.setBounds(100, 100, 300, 300);
        setVisible(true);
        WindowsCloseAction.WindowsClose(this);
    }
    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawOval(100, 100, 100, 100);
        g.fillRect(20, 20, 100, 100);
    }
}