package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop4;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:51
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("在沉睡中被停止！进入catch！" + this.isInterrupted());
            e.printStackTrace();
        }
    }
}
