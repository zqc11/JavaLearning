package com.silentsunshine.gui;

import java.awt.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/9 - 02 - 09 - 17:51
 * @description practice com.silentsunshine.gui
 */
public class TestLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBackground(Color.white);
        frame.setBounds(100, 100, 800, 500);
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        frame.setLayout(new GridLayout(2, 3));
        frame.setResizable(false);
        Button button1 = new Button("button1");
        Button button2 = new Button("button2");
        Button button3 = new Button("button3");
        Button button4 = new Button("button4");
        Button button5 = new Button("button5");
        Button button6 = new Button("button6");
        Button button7 = new Button("button7");
        Button button8 = new Button("button8");
        Button button9 = new Button("button9");
        Button button10 = new Button("button10");
        button1.setBounds(new Rectangle(10, 250));
        button1.setSize(10, 250);
        panel1.setLayout(new GridLayout(2, 1));
        panel1.add(button5);
        panel1.add(button6);
        panel2.setLayout(new GridLayout(2, 2));
        panel2.add(button7);
        panel2.add(button8);
        panel2.add(button9);
        panel2.add(button10);
        frame.add(button1);
        frame.add(panel1);
        frame.add(button2);
        frame.add(button3);
        frame.add(panel2);
        frame.add(button4);

        frame.setVisible(true);
    }
}
