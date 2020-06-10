package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread10.Priority1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/10 23:07
 * @Description:
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 run priority=" + this.getPriority());
        MyThread2 thread2 = new MyThread2();
        thread2.start();
    }
}
