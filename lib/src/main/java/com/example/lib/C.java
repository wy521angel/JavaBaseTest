package com.example.lib;

public class C {

    public C() {//构造函数
        System.out.println("C的构造函数");
    }

    {//构造代码块
        System.out.println("C的构造代码块");
    }

    static {//静态代码块
        System.out.println("C的静态代码块");
    }

    public static D d = new D("C");
}
