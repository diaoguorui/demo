package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:39
 * @Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.interrupted()) {
                System.out.println("已经是停止状态，我要退出了");
                break;
            }
            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");
    }
}
