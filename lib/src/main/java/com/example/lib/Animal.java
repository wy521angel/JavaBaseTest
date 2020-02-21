package com.example.lib;

//动物这个类比较抽象，没有具体的属性，写成接口比较合理
public interface Animal {
    //所有的动物都离不开eat（吃）这个行为，把吃放在动物这个类（接口也是一种特殊的类）是合理的，写一个方法来模拟吃这个行为。
    public void eat();
    //move（行走）这个行为不能放在这儿，有些动物不能行走，比如鱼类
//    void move();
}
