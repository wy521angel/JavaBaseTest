package com.example.lib;

/**
 * 声明一个猴子类
 */
public class Monkey implements Primat {

    //添加了属性，未加private修饰，同包类能访问
    String name;
    //构造函数
    public Monkey(String name) {
        this.name = name;
    }

    @Override
    public void eat() {//已经有了具体的行为，需要实现该行为。
        System.out.println(name + "吃起了香蕉");
    }

    @Override
    public void move() {//已经有了具体的行为，需要实现该行为。
        System.out.println(name + "开始在树上跳来跳去");
    }
}
