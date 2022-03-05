package com.icey;

/**
 * 子类
 *
 */
public class Zi extends Fu {
    public Zi() {
        System.out.println("Zi中无参方法被调用");
    }

    public Zi(int age) {
        System.out.println("Zi中带参构造方法被调用");
    }

    @Override // 注解,意思为重写、覆盖,表明下面方法重写父类，可以帮助检查方法声明是否与父类一致
    public void show() {
        super.show();
        System.out.println(super.age);
        System.out.println("Zi类中的show方法被调用");
    }
}