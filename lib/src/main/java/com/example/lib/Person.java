package com.example.lib;

/**
 * 人类这一层已经有了属性（名字，年龄），再抽象成接口就不合理了，这儿声明成了类
 */
public class Person implements Primat {

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    //构造函数
    public Person(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    //添加了属性，未加private修饰，同包类能访问
    String name;
    String sex;

    //年龄这个属性用了private来修饰，外部类看不到，这就是封装
    private Integer age;

    @Override
    public void eat() {//已经有了具体的行为，需要实现该行为。
        System.out.println(name + "拿起碗开始吃饭");
    }

    @Override
    public void move() {//已经有了具体的行为，需要实现该行为。
        System.out.println(name + "站起来开始走路");
    }

    public void printAge() {
        if (isLady(sex)) {//isLady这个方法其它类访问不到，但该类自身是可以访问的
            System.out.println(name + "女士的年龄可是秘密，不告诉你");
            return;
        }
        System.out.println(name + age + "岁了");
    }

    //这个方法也用了private来修饰，外部类看不到，也无法调用该方法，这就是封装
    private boolean isLady(String sex) {
        if (sex.equals("女")) {
            return true;
        }
        return false;
    }

    /**
     * 内置了比较方法
     *
     * @param person
     * @return
     */
    public boolean isSame(Person person) {
        //如果名字相同返回true，否则返回false
        if (this.name.equals(person.name)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object other) {
        //先判断是否是同一个对象，如果是直接返回true
        if (this == other) {
            return true;
        }
        //判断other是否是Person的实例
        if (other instanceof Person) {
            Person otherPerson = (Person) other;//转换类型
            return name.equals(otherPerson.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        //重写hashCode方法，这里直接返回name的hashCode
        return name.hashCode();
    }
}
