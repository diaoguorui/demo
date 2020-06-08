package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread4.MultiThread1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 21:58
 * @Description:
 */
public class MyThread extends Thread {
    private int i = 5;

    @Override
    public void run() {
        System.out.println("i=" + (i--) + " threadName=" + Thread.currentThread().getName());
    }
}
