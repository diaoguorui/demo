package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread3.CurrentThread;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:13
 * @Description:
 */
public class CountOperate extends Thread {
    public CountOperate() {
        System.out.println("CountOperate---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("CountOperate---end");
    }

    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("run---end");
    }
}
