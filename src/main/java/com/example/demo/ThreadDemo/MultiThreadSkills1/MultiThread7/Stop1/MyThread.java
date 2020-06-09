package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:10
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i + 1));
        }
    }
}
