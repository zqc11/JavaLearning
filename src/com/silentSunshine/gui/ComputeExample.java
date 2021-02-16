package com.silentsunshine.gui;

import com.silentsunshine.gui.lib.WindowsCloseAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/16 - 02 - 16 - 9:58
 * @description practice com.silentsunshine.gui
 */
public class ComputeExample {
    public static void main(String[] args) {
        new Compute();
    }
}

class Compute extends Frame {
    StringBuilder stringBuilder = new StringBuilder();
    Label textField;
    Button buttonClear = new Button("Clear");
    Button buttonDiv = new Button("/");
    Button buttonMuti = new Button("*");
    Button buttonAdd = new Button("+");
    Button buttonSub = new Button("-");
    Button buttonEqual = new Button("=");
    Button buttonDelete = new Button("<<<");
    Button button1 = new Button("1");
    Button button2 = new Button("2");
    Button button3 = new Button("3");
    Button button4 = new Button("4");
    Button button5 = new Button("5");
    Button button6 = new Button("6");
    Button button7 = new Button("7");
    Button button8 = new Button("8");
    Button button9 = new Button("9");
    Button button0 = new Button("0");
    Button buttonPercent = new Button("%");
    Button buttonDou = new Button(".");
    public Compute() {
        super("计算器");
        setBounds(600, 70, 500, 700);
        setLayout(null);
        //setResizable(false);
        addInputTextFeild();
        addButton();
        setButtonListener();
        setVisible(true);
        WindowsCloseAction.WindowsClose(this);
    }

    private void setButtonListener() {
        button0.addActionListener(new MyButtonListener(textField,stringBuilder));
        button1.addActionListener(new MyButtonListener(textField,stringBuilder));
        button2.addActionListener(new MyButtonListener(textField,stringBuilder));
        button3.addActionListener(new MyButtonListener(textField,stringBuilder));
        button4.addActionListener(new MyButtonListener(textField,stringBuilder));
        button5.addActionListener(new MyButtonListener(textField,stringBuilder));
        button6.addActionListener(new MyButtonListener(textField,stringBuilder));
        button7.addActionListener(new MyButtonListener(textField,stringBuilder));
        button8.addActionListener(new MyButtonListener(textField,stringBuilder));
        button9.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonClear.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonDiv.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonMuti.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonDelete.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonAdd.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonSub.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonEqual.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonPercent.addActionListener(new MyButtonListener(textField,stringBuilder));
        buttonDou.addActionListener(new MyButtonListener(textField,stringBuilder));
    }

    private void addButton() {
        Panel computePanel1 = new Panel();
        computePanel1.setBounds(new Rectangle(0, 200, 500, 500));
        computePanel1.setLayout(null);

        Panel computePanel2 = new Panel();
        computePanel2.setBounds(new Rectangle(0, 0, 375, 500));
        computePanel2.setLayout(new GridLayout(5, 3));
        addButtonToPanel2(computePanel2);

        Panel computePanel3 = new Panel();
        computePanel3.setBounds(new Rectangle(375, 0, 125, 500));
        computePanel3.setLayout(null);

        Panel computePanel4 = new Panel();
        computePanel4.setBounds(new Rectangle(0, 0, 125, 300));
        computePanel4.setLayout(new GridLayout(3, 1));
        addButtonToPanel4(computePanel4);

        buttonEqual.setBounds(new Rectangle(0, 300, 125, 200));
        computePanel3.add(computePanel4);
        computePanel3.add(buttonEqual);
        computePanel1.add(computePanel2);
        computePanel1.add(computePanel3);
        this.add(computePanel1);
    }

    private void addButtonToPanel4(Panel computePanel4) {
        computePanel4.add(buttonDelete);
        computePanel4.add(buttonAdd);
        computePanel4.add(buttonSub);
    }

    private void addButtonToPanel2(Panel panel) {
        panel.add(buttonClear);
        panel.add(buttonDiv);
        panel.add(buttonMuti);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(buttonPercent);
        panel.add(button0);
        panel.add(buttonDou);
    }


    private void addInputTextFeild() {
        textField = new Label("   nihao");
        textField.setBounds(new Rectangle(0,0,500, 200));
        add(textField);
    }
}

class MyButtonListener implements ActionListener {
    StringBuilder sb;
    Label textField;

    public MyButtonListener(Label textField, StringBuilder stringBuilder) {
        this.textField = textField;
        this.sb = stringBuilder;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        sb.append(e.getActionCommand()+" ");
        textField.setText(sb.toString());
    }
}
