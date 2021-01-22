package com.silentsunshine.generic;

/**
 * @auther: zhouqichun
 * @date: 2021/1/17 - 01 - 17 - 21:30
 * @description: com.silentsunshine.generic
 * @version: 1.0
 */
public class Generic<T> {
    private T key;

    public Generic() {
    }

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }
}
