package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:41
 * @Description:
 */
public class SynchronizedObject {
    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
