package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop5;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:05
 * @Description:
 */
public class MyThread extends Thread {
    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                i++;
                System.out.println("i=" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
