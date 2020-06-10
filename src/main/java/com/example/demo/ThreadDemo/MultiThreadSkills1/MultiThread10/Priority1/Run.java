package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread10.Priority1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/10 23:10
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority=" + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
