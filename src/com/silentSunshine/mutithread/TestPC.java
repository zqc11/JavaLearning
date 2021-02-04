package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/4 - 02 - 04 - 16:56
 * @description practice com.silentsunshine.mutithread
 */
//生产者消费者模型：管程法
public class TestPC {
    public static void main(String[] args) {
        Container container = new Container();
        Producer producer = new Producer(container);
        Costumer costumer = new Costumer(container);
        new Thread(producer).start();
        new Thread(costumer).start();
    }
}

//生产者
class Producer implements Runnable {
    Container container;

    public Producer(Container container) {
        this.container = container;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chitken(i));
            System.out.println("生产者生产了第"+i+"只鸡");
        }
    }
}
//消费者
class Costumer implements Runnable {
    Container container;

    public Costumer(Container container) {
        this.container = container;
    }
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("消费者消费了第"+container.pop().id+"只鸡");
        }
    }
}

//容器
class Container {
    Chitken[] chitkens = new Chitken[10];
    int count=0;

    public Container() {

    }
    //生产者生产鸡
    public synchronized void push(Chitken chitken) {
        //如果容器满了，通知消费者消费，生产者等待
        if (count == chitkens.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //没满，则将鸡加进来，并通知消费者
        chitkens[count] = chitken;
        count++;
        this.notifyAll();
    }

    //消费者吃鸡
    public synchronized Chitken pop() {
        if (count == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        this.notifyAll();
        return chitkens[count];
    }
}

//产品
class Chitken {
    int id;

    public Chitken(int id) {
        this.id = id;
    }
}
