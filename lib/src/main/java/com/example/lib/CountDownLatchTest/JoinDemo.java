package com.example.lib.CountDownLatchTest;

import java.util.Vector;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class JoinDemo {
    private final static Vector v = new Vector();
    Lock lock = new ReentrantLock();
    final Condition condition = lock.newCondition();//创建condition对象

    private static class WriteThread extends Thread {
        private final String writeThreadName;
        private final int stopTime;
        private final String str;
        Lock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();//创建condition对象

        public WriteThread(String name, int time, String str) {
            this.writeThreadName = name;
            this.stopTime = time;
            this.str = str;
        }

        public void run() {
            System.out.println(writeThreadName + "开始写入工作");
            try {
                Thread.sleep(stopTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            v.add(str);
            System.out.println(writeThreadName + "写入内容为：" + str + "。写入工作结束！");
        }
    }

    private static class ReadThread extends Thread {
        Lock lock = new ReentrantLock();
        final Condition condition = lock.newCondition();//创建condition对象

        public void run() {
            System.out.println("读操作之前必须先进行写操作");
            try {
                Thread.sleep(10000);//该线程进行暂停，时间控制在写操作结束才使线程苏醒过来。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < v.size(); i++) {
                System.out.println("读取第" + (i + 1) + "条记录内容为：" + v.get(i));
            }
            System.out.println("读操作结束！");
        }
    }

    public static void main(String[] args) {

        ReadThread readThread = new ReadThread();
        readThread.start();
        long start = System.currentTimeMillis();
        Thread[] write = new Thread[3];
        String[] str = {"多线程知识点", "多线程CountDownLatch的知识点", "多线程中控制顺序可以使用CountDownLatch"};

        for (int i = 0; i < 3; i++) {
            Thread t1 = new WriteThread("writeThread" + (i + 1), 1000 * (i + 1), str[i]);
            t1.start();
            write[i] = t1;
        }
        try {
            readThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //等待线程结束
        for (Thread t : write) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //等待线程结束
    }
}
