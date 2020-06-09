package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread9.Yield;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 23:09
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < 500000; i++) {
            Thread.yield();
            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
    }
}
