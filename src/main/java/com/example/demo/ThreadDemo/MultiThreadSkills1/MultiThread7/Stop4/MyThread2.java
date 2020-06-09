package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop4;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:56
 * @Description:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 100000; i++) {
                System.out.println("i=" + (i + 1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        } catch (InterruptedException e) {
            System.out.println("先停止，再遇到了sleep，进入catch");
            e.printStackTrace();
        }
    }
}
