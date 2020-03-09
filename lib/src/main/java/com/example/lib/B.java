package com.example.lib;

public class B extends C {

    {//构造代码块
        System.out.println("B的构造代码块");
    }

    public B() {//构造函数
        System.out.println("B的构造函数");
    }

    public static D d = new D("B");

    static {//静态代码块
        System.out.println("B的静态代码块");
    }

}
