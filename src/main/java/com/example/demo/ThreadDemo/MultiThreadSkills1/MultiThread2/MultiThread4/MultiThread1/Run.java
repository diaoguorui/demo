package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread4.MultiThread1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:00
 * @Description:
 */
public class Run {
    // 概率性的会出现线程安全问题，虽然println()方法在内部是同步的，但是i--的操作确实在进入println()之前发生的，所以有
    // 发生非线程安全问题的概率

    public static void main(String[] args) {
        MyThread run = new MyThread();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
