package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread10.Priority1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/10 23:08
 * @Description:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 run priority=" + this.getPriority());
    }
}
