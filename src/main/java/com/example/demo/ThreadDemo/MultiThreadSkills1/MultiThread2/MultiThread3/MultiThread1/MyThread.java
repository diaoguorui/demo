package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.MultiThread3.MultiThread1;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:59
 * @Description:
 */
public class MyThread extends Thread {
    private int count = 5;
    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + " 计算， count=" + count);
        }
    }
}
