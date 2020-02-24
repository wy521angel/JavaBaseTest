package com.example.lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class MyClass {
    private static void packageTest() {
        System.out.println(Integer.MAX_VALUE);//打印int能表示的最大值
        System.out.println(Integer.MIN_VALUE);//打印int能表示的最小值
        System.out.println(Integer.max(12, 13));//找出传入参数的大值
        System.out.println(Integer.min(12, 13));//找出传入参数的小值
        System.out.println(Integer.sum(12, 13));//求和
        System.out.println(Integer.valueOf("123"));//转换字符串为Integer类型
        System.out.println(Integer.compare(12, 54));//比较参数大小，返回-1，代表第一个参数小于第二个参数
        /**
         * 这种方式是可以写的，因为会在编译时解包处理后比较值 new Integer(180).intValue()<new Integer(180).intValue()
         */
        System.out.println(new Integer(180) < new Integer(180));
        System.out.println(new Integer(180).equals(new Integer(180)));//比较是否相等，推荐写法equals
        System.out.println(new Integer(180) == new Integer(180));//==是比较两个对象指向的引用是否一致，不能用来比较值是否相等，此处会返回false
    }

    private static void animalTest() {
        Animal animal1 = new Monkey("小猴1");//小猴1以Animal形态出现
        Animal animal2 = new Person("张三", "男", 21);//张三以Animal形态出现

        Primat primat = new Person("李四", "男", 21);//李四以primat形态出现
        Person person3 = new Person("王小姐", "女", 18);//王小姐以Person形态出现
        Person person4 = new Person("王五", "男", 26);//王五以Person形态出现
        animal1.eat();//以Animal形态出现，只能调用Animal里的eat()方法，该方法能打印出相应结果
        animal2.eat();//以Animal形态出现，只能调用Animal里的eat()方法，该方法能打印出相应结果
//        animal1.move();//报错，编译不过，以Animal形态出现时只能调用Animal里的方法
//        animal1.getAge();//报错，编译不过，以Animal形态出现时只能调用Animal里的方法
        primat.eat();//以Primat形态出现，由于继承了Animal类，可以调用Animal里的eat()方法
        primat.move();//以Primat形态出现，可以调用自身的move()方法
//        primat.getAge();//报错，编译不过，以Primat形态出现只能调用Primat及其父类里的方法

        person3.eat();//以Person类形态出现，可以调用继承的方法
        person3.move();//以Person类形态出现，可以调用继承的方法
        person3.printAge();//以Person类形态出现，调用自身方法
        person4.printAge();//以Person类形态出现，调用自身方法

        ((Person) animal2).printAge();//把形态强制转型成Person形态，可以调用Person里的方法
    }

    private static void samePersonTest() {
        String str1 = new String("张三");
        String str2 = new String("张三");
        Set<String> strSet = new HashSet<>();
        strSet.add(str1);
        strSet.add(str2);
        System.out.println("strSet.size()" + strSet.size());

        Person person1 = new Person("张三");
        Person person2 = new Person("张三");
        Set<Person> personSet = new HashSet<>();
        personSet.add(person1);
        personSet.add(person2);
        System.out.println("personSet.size()" + personSet.size());
    }

    private static void samePersonTest2() {
        Person person1 = new Person("张三");
        Person person2 = new Person("张三");
        //引入List辅助测试
        List<Person> perList = new ArrayList<>();
        //把person1放入了List中，但是并没有放Person2
        perList.add(person1);
        //set
        Set<Person> pSet = new HashSet<>();
        //把person1放入了Set中，但是并没有放Person2
        pSet.add(person1);
        System.out.println("person1.equals(person2)" + person1.equals(person2));
        System.out.println("perList.contains(person2)" + perList.contains(person2));
        System.out.println("pSet.contains(person2)" + pSet.contains(person2));
    }

    private static void operateArrayList() {
        List<Person> perList = new ArrayList<>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));
        perList.add(new Person("孙七", 32));
        perList.add(new Person("周八", 17));
        perList.add(new Person("钱九", 24));
        perList.add(new Person("吴十", 23));
        perList.add(new Person("冯十一", 18));
        perList.add(new Person("朱十二", 36));

        perList.remove(5);//删除ArrayList里下标为5的元素
        perList.remove(new Person("孙七", 32));//删除孙七
        perList.add(2, new Person("李莫愁", 29));//把李莫愁放到下标为2的位置
        System.out.println("perList.size()" + perList.size());
    }

    private static void operateLinkedList() {
        List<Person> perList = new LinkedList<>();
        perList.add(new Person("张三", 21));
        perList.add(new Person("李四", 19));
        perList.add(new Person("王五", 25));
        perList.add(new Person("赵六", 24));

        System.out.println("删除前的perList.size()：" + perList.size());
        boolean delState = perList.remove(new Person("王五", 25));//删除王五，返回删除状态
        System.out.println("打印删除状态：" + delState);
        System.out.println("删除后的perList.size()：" + perList.size());
    }

    private static void operateHashMap() {
        Map<String, Person> personMap = new HashMap<>();
        personMap.put("张三", new Person("张三", 21));
        personMap.put("李四", new Person("李四", 19));
        personMap.put("王五", new Person("王五", 25));
        personMap.put("赵六", new Person("赵六", 24));
        personMap.put("孙七", new Person("孙七", 32));
        personMap.put("周八", new Person("周八", 17));
        personMap.put("钱九", new Person("钱九", 24));
        personMap.put("吴十", new Person("吴十", 23));

        System.out.println("personMap.size()：" + personMap.size());
    }

    public static void main(String[] args) {

    }
}
