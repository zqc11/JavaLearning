package com.silentsunshine.gui.lib;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/16 - 02 - 16 - 9:51
 * @description practice com.silentsunshine.gui.lib
 */
public class WindowsCloseAction {
    public static void WindowsClose(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
