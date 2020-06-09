package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:42
 * @Description:
 */
public class Run {
//    虽然停止了线程，但是MyThread中for语句下面还有语句，还是会继续运行的

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
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
