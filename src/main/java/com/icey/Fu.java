package com.icey;
/**
 * 父类
 *
 */
public class Fu {
    public int age = 20;

    public Fu() {
        System.out.println("Fu中无参方法被调用");
    }

    public Fu(int age) {
        System.out.println("Fu中带参构造方法被调用");
    }

    public void show() {
        int age = 30;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println("Fu类中的show方法被调用");
    }
}