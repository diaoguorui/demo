package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread1.MultiThread3;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:42
 * @Description:
 */
public class MyThread extends Thread {
    private int i;

    public MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
