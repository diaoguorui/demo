package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:30
 * @Description:
 */
public class MyThread extends Thread {
    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true) {
            i++;
        }
    }
}
