package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop6;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:09
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            this.stop();
        } catch (ThreadDeath e) {
            System.out.println("进入了catch方法");
            e.printStackTrace();
        }
    }
}
