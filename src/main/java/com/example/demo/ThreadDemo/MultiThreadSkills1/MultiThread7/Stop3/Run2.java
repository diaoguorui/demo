package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:42
 * @Description:
 */
public class Run2 {
//    通过抛出异常的方式，停止线程

    public static void main(String[] args) {
        try {
            MyThread2 thread = new MyThread2();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
