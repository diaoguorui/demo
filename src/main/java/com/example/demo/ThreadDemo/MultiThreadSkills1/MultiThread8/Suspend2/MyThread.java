package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:50
 * @Description:
 */
public class MyThread extends Thread {
    private long i = 0;

    @Override
    public void run() {
        while (true) {
            i++;
            System.out.println(i);
        }
    }
}
