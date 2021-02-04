package com.silentsunshine.mutithread;

/**
 * @author zhouqichun
 * @version 1.0
 * @date 2021/2/3 - 02 - 03 - 10:50
 * @description practice com.silentsunshine.mutithread
 */
public class StaticProxy {
    public static void main(String[] args) {
        You you = new You();
        WeddingCompany weddingCompany = new WeddingCompany(you);
        weddingCompany.marry();

    }
}
interface Marry{
    void marry();
}

class You implements Marry{
    @Override
    public void marry() {
        System.out.println("我要结婚了，我很开心！");
    }
}

class WeddingCompany implements Marry{
    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }
    @Override
    public void marry() {
        before();
        target.marry();
        after();
    }

    private void after() {
        System.out.println("婚后收份子钱。");
    }

    private void before() {
        System.out.println("婚前布置现场。");
    }
}
