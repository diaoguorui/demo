package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop4;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:53
 * @Description:
 */
public class Run {
//    先sleep(),再interrupt()
//    如果在sleep状态下停止某一线程，会进入catch语句，并且清除状态值，使之变成false

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(200);
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
