package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread5.Sleep;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 19:51
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
