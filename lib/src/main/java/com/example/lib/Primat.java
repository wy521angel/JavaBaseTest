package com.example.lib;

/**
 * 灵长类继承了动物这个接口，所以也继承了动物吃的行为（这就是继承带来的好处，不用再重复写一次吃这个行为的代码）
 */
public interface Primat extends Animal {
    //这儿扩展了一个move（行走）行为方法
    public void move();
}
