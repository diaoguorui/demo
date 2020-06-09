package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop8;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:23
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }
}
