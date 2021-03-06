package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread1.MultiThread2;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:27
 * @Description:
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
