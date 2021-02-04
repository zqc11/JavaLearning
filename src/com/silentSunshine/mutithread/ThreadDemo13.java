package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 11:15
 * @description practice com.silentsunshine.mutithread
 */
public class ThreadDemo13 {
    //不安全的并发测试
    public static void main(String[] args) {
        Account account = new Account(1000, "结婚基金");
        DrawMoney drawMoney = new DrawMoney(account, 100, "我");
        DrawMoney drawMoney2 = new DrawMoney(account, 100, "老婆");
        new Thread(drawMoney).start();
        new Thread(drawMoney2).start();
    }
}

class Account{
    private int money;
    private String name;
    public Account(int money, String name){
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }
}

class DrawMoney extends Thread{
    Account account;
    private int drawMoney;
    private int nowMoney=0;
    private boolean flag;
    public DrawMoney(Account account, int drawMoney, String name){
        this.account = account;
        this.drawMoney = drawMoney;
        this.setName(name);
        flag = true;
    }

    @Override
    public synchronized void run() {
        synchronized (account) {
            while (flag) {
                if (account.getMoney() - drawMoney < 0) {
                    System.out.println("余额不足！账户余额为："+account.getMoney());
                    flag = false;
                    return;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account.setMoney(account.getMoney()-drawMoney);
                nowMoney += drawMoney;
                System.out.println(this.getName()+"取走了"+drawMoney+
                        ", 现在手里有："+nowMoney);
            }
        }

    }
}
