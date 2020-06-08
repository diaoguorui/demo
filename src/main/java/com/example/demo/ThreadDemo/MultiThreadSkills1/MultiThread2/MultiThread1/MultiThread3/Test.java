package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread1.MultiThread3;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:43
 * @Description:
 */
public class Test {
//    执行start()方法的顺序不代表线程启动的顺序

    public static void main(String[] args) {
        MyThread t11 = new MyThread(1);
        MyThread t12 = new MyThread(2);
        MyThread t13 = new MyThread(3);
        MyThread t14 = new MyThread(4);
        MyThread t15 = new MyThread(5);
        MyThread t16 = new MyThread(6);
        MyThread t17 = new MyThread(7);
        MyThread t18 = new MyThread(8);
        MyThread t19 = new MyThread(9);
        MyThread t110 = new MyThread(10);
        MyThread t111 = new MyThread(11);
        MyThread t112 = new MyThread(12);
        MyThread t113 = new MyThread(13);
        t11.start();
        t12.start();
        t13.start();
        t14.start();
        t15.start();
        t16.start();
        t17.start();
        t18.start();
        t19.start();
        t110.start();
        t111.start();
        t112.start();
        t113.start();
    }
}
