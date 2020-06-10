package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:20
 * @Description:
 */
public class Run {
//    线程没有中断效果
//    运行thread.interrupt()代码的线程是main线程

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
//        Thread.currentThread().interrupt();
            System.out.println("是否停止1? =" + thread.interrupted());
            System.out.println("是否停止2? =" + thread.interrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
