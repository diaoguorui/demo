package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread11.Daemon;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/10 23:25
 * @Description:
 */
public class Run {
//    thread线程守护main线程，当main线程执行完成后，thread线程自行销毁

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("我离开thread对象也不再打印了，也就是停止了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
