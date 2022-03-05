package com.icey;

public class Zi extends Fu {
    public Zi() {
        super();
        System.out.println("Zi中无参方法被调用");
    }

    public Zi(int age) {
        super();
        System.out.println("Zi中带参构造方法被调用");
    }

    public void show() {
        super.show();
        System.out.println(super.age);
    }
}