package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread5.Sleep;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 19:53
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin =" + System.currentTimeMillis());
        myThread.run();
        System.out.println("end =" + System.currentTimeMillis());
    }
}
