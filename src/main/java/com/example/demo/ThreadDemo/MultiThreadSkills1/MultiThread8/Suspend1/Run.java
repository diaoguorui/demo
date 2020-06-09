package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend1;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:31
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(5000);

            // A段
            thread.suspend();
            System.out.println("A=" + System.currentTimeMillis() + "i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("A=" + System.currentTimeMillis() + "i=" + thread.getI());

            // B段
            thread.resume();
            Thread.sleep(5000);

            // C段
            thread.suspend();
            System.out.println("B=" + System.currentTimeMillis() + "i=" + thread.getI());
            Thread.sleep(5000);
            System.out.println("B=" + System.currentTimeMillis() + "i=" + thread.getI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
