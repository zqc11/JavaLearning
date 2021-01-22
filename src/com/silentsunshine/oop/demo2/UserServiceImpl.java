package com.silentsunshine.oop.demo2;

/**
 * @auther: zhouqichun
 * @date: 2021/1/17 - 01 - 17 - 11:09
 * @description: com.silentsunshine.oop.demo2
 * @since 1.8
 * @version: 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void change() {
        System.out.println("change");

    }

    @Override
    public void query() {
        System.out.println("query");

    }
}
