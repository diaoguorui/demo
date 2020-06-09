package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop8;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:24
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            Thread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
