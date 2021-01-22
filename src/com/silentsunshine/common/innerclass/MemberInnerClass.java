package com.silentsunshine.common.innerclass;

/**
 * @auther: zhouqichun
 * @date: 2021/1/18 - 01 - 18 - 8:31
 * @description: com.silentsunshine.common.innerclass
 * @version: 1.0
 */
public class MemberInnerClass {
    public static void main(String[] args) {
        //创建外部类对象
        Outer outer = new Outer();
        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        //Outer.Inner inner2 = outer.new Inner();
        //外部类对象调用方法
        System.out.println();

        outer.print(); //Outer
        outer.inner.yell("形式参数1");

        //内部类对象调用方法
        inner.print(); //Inner
        inner.yell("形式参数2");
    }
}
class Outer{
    private int anInt = 1;
    private String string = "Outer";
    //在外部类中创建内部类对象
    public Outer.Inner inner = new Inner();
    //外部类方法
    public void print(){
        System.out.println("outer");

    }

    class Inner {
        private int anInt2 = 2;
        private String string = "Inner";
        //内部类方法
        public void print(){
            System.out.println("inner");
        }
        public void yell(String string){
            //内部类直接调用外部类的属性
            System.out.println(anInt);
            //内部类调用自身属性
            System.out.println(anInt2);
            //如果外部类与内部类有名称相同的字段时，可以通过以下方法
            //调用字段
            //调用外部类字段

            System.out.println(Outer.this.string);
            //调用内部类字段
            System.out.println(this.string);
            //传入的参数
            System.out.println(string);
        }
    }
}
