package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread4.IsAlive;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:20
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
