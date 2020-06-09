package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:45
 * @Description:
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("已经是停止状态，我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我在for下面");
        } catch (InterruptedException e) {
            System.out.println("进MyThread2.java类run方法中的catch了！");
            e.printStackTrace();
        }
    }
}
