package com.silentsunshine.gui.swing;

import javax.swing.*;
import java.awt.*;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/3/5 - 03 - 05 - 20:07
 * @description practice com.silentsunshine.gui.swing
 */
public class JFrameTest {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = screenSize.width >> 1;
        int height = screenSize.height >> 1;
        EventQueue.invokeLater(()->{
            JFrame jFrame = new JFrame();
            jFrame.setLayout(new FlowLayout());
            NotHelloWorldComponent component = new NotHelloWorldComponent();
            component.setVisible(true);
            JPanel panel = new JPanel();
            panel.setVisible(true);
            panel.add(component);
            jFrame.setSize(width, height);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            jFrame.add(panel);
            jFrame.setVisible(true);
        });
    }

    static class NotHelloWorldComponent extends JComponent {

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.red);
            g.drawString("Not Hello, World Program.", 75, 100);
            g.drawOval(20, 20, 50,60);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(300, 200);
        }
    }
}
