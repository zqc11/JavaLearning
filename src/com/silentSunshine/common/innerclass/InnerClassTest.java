package com.silentSunshine.common.innerclass;

/**
 * @auther: zhouqichun
 * @date: 2021/1/18 - 01 - 18 - 15:16
 * @description: com.silentSunshine.common.innerclass
 * @version: 1.0
 */
public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //获得内部类对象
        OuterClass.InnerClass innerClass1 = outerClass.inner();
        OuterClass.InnerClass innerClass2 = outerClass.inner();
        OuterClass.InnerClass innerClass3 = outerClass.inner();
        //如果想从外部类的非静态方法之外在任意位置创建内部类对象时，
        //类型必须指定为：OutClassName.InnerClassName
        outerClass.print();
        innerClass1.print();
        System.out.println("before change, outClass.anInt:"+outerClass.getAnInt());
        //使用内部类对象改变外围类对象的字段
        innerClass1.setAnInt(2);
        System.out.println("after change by innerClass1, outClass.anInt:"+outerClass.getAnInt());
        innerClass2.setAnInt(3);
        System.out.println("after change by innerClass2, outClass.anInt:"+outerClass.getAnInt());
        innerClass3.setAnInt(4);
        //innerClass1.outer; Error, 不能直接访问outerClass的out字段
        System.out.println("after change by innerClass3, outClass.anInt:"+outerClass.getAnInt());

    }
}

class OuterClass{
    public String outer = "outer";
    private int anInt = 1;

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public void print(){
        System.out.println("outerClass");
    }
    //该方法返回内部类的一个对象
    public InnerClass inner(){
        return new InnerClass();
    }

    class InnerClass{
        public void setAnInt(int anInt){
            OuterClass.this.anInt = anInt;
        }
        public void print(){
            System.out.println("innerClass");
            //System.out.println(outer);
        

        }
    }

}
