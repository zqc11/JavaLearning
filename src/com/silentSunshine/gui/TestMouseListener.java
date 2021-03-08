package com.silentsunshine.gui;

import com.silentsunshine.gui.lib.WindowsCloseAction;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/16 - 02 - 16 - 22:07
 * @description practice com.silentsunshine.gui
 */
public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame4("画图");
    }
}

class MyFrame4 extends Frame {
    private ArrayList<Point> points;

    public MyFrame4(String title) {
        super(title);
        points = new ArrayList<>();
        setBounds(100, 100, 600, 600);
        addMouseListener(new MyMouseListener());
        setVisible(true);
        WindowsCloseAction.WindowsClose(this);

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        Iterator<Point> iterator = points.iterator();
        Point tempPoint;
        while (iterator.hasNext()) {
            tempPoint = iterator.next();
            g.fillOval(tempPoint.x, tempPoint.y, 3, 3);
        }
    }

    private class MyMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            Frame frame = (Frame) e.getSource();
            points.add(e.getPoint());
            frame.repaint();
        }
        

    }


}
