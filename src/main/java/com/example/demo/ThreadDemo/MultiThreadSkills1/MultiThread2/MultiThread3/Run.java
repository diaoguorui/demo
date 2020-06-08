package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread3;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 23:02
 * @Description:
 */
public class Run {
//    不共享数据

    public static void main(String[] args) {
        MyThread a = new MyThread("A");
        MyThread b = new MyThread("B");
        MyThread c = new MyThread("C");

        a.start();
        b.start();
        c.start();
    }
}
