package com.silentsunshine.gui;

import com.silentsunshine.gui.lib.WindowsCloseAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/16 - 02 - 16 - 9:44
 * @description practice com.silentsunshine.gui
 */
public class TestText {
    public static void main(String[] args) {
        new MyFrame2();
    }
}

class MyFrame2 extends Frame {
    public MyFrame2() {
        TextField textField = new TextField(6);
        add(textField);
        textField.addActionListener(new MyActionListener());
        textField.setEchoChar('*');
        WindowsCloseAction.WindowsClose(this);
        setVisible(true);
        pack();
    }
}

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();
        System.out.println(textField.getText());
        textField.setText("");
    }
}