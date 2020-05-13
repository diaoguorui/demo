package com.example.demo.ThreadDemo.MultiThread1;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:04
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
