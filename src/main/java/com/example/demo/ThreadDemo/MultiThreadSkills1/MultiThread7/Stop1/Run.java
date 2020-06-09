package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:12
 * @Description:
 */
public class Run {
//    调用interrupt()方法仅仅是在当前线程中打了一个停止的标记，并不是真的停止线程

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
