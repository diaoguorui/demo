package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop5;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:06
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(8000);
            thread.stop();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
