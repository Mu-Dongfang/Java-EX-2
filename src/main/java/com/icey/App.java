package com.icey;

/*
包:其实就是文件夹,作用是对类进行分类整理
包的定义格式:package 包名(多级包用.分开)
*/

import com.zc.HelloWorld;
/*导包:
背景:使用不同包下的类时,调用时要写类的全路径,过于繁琐;
为了简化带包的操作,Java提供了导包的功能
格式: import 包名
*/

/**
 * Java练习2
 */
public class App {
    public static void main(String[] args) {
        /*
         * 继承: 面向对象三大特征之一,可以使得子类具有父类的属性和方法,还可以在子类中重新定义,追加属性和方法
         * 优点：提高了代码的复用性、维护性
         * 弊端：削弱了子类的独立性
         * 当类之间具有"is a"关系时，推荐使用继承
         * 格式: public class 子类名 extends 父类名{}
         * 方法和变量自底向上寻找调用
         * this.代表本类对象的引用,super.代表父类存储空间的标识,可以理解为父类对象的引用
         * 继承的构造方法调用:
         * 子类中所有的构造方法默认都会访问父类中的无参构造方法,推荐自己给出父类无参构造方法
         * 可以通过super关键字去显式调用父类构造方法
         * 原因:
         * 1.子类会继承父类的数据,可能还会使用父类的数据,因此父类会先于子类进行初始化
         * 2.每个子类构造方法的第一条语句默认是: super();表示调用父类无参构造方法
         * 父类提供的方法可以被子类覆盖,重载,以及在原有基础上添加
         * 父类中的private对象无法被子类继承，子类的修饰符权限不能比父类严格(public>默认>protected>private)
         * 一个类不能同时继承多个类(单继承),但可以进行多层继承
         * 抽象类:接口类,无法创建该类的实例,必须被被继承否则无意义
         * 格式:
         * abstract public class 类名{}
         * 方法也可以声明为抽象方法,抽象方法必须被覆盖过,且没有函数体
         * 不能在非抽象的类中拥有抽象方法
         */
        /*
         * 覆盖的规则:
         * 1.参数必须要一致,且返回类型必须兼容
         * 2.不能降低方法的存取权限
         * 重载的规则:
         * 1.返回类型可以不同
         * 2.不能只改变返回类型,要使用不同的参数
         * 3.可以更改存取权限
         */
        /*
         * 修饰符:
         * 权限修饰符       同一个类中      同包中子类/无关类       不同包子类      不同包无关类
         * private              √
         * 默认                 √                   √
         * protected            √                   √                √
         * public               √                   √                √               √
         * 状态修饰符
         * final:最终态修饰符，可以修饰成员方法，成员变量，类.
         * 方法修饰后无法被重写,类被修饰后无法作为父类被继承
         * 基本变量修饰后表明该变量为常量,其数据值无法被改变
         * 引用变量修饰后无法修改其地址值,但地址中的内容可以发生改变
         * static:静态修饰符,可以修饰成员方法和成员变量
         * static修饰的内容将被类的所有对象共享,可以通过类名调用(推荐)也可以通过对象名调用
         */
        /*
         * 多态:
         * 运用多态时,引用类型可以是实际对象类型的父类
         * 将参数声明成父类类型,可以在运行时传入任意子类对象
         */
        Zi z = new Zi();
        Zi z2 = new Zi(40);
        z.show();
        z2.show();
        HelloWorld.main(args);
        /*
         抽象方法:没有方法体的方法应定义为抽象方法
         抽象类:不必产生实体的类,若类中含有抽象方法,则该类必须定义为抽象类
         抽象声明前加上关键字abstract修饰
         子类继承抽象父类后必须具体化父类的抽象方法
         */
    }
}