package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread3.CurrentThread;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:08
 * @Description:
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("构造方法的打印：" + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("run方法的打印：" + Thread.currentThread().getName());
    }
}
