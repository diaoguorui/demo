package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:35
 * @Description:
 */
public class Run3 {
//    isInterrupted()并未清除状态标志
//    this.isInterrupted(): 测试线程Thread对象是否已经是中断状态，但不清除状态标志；案例中线程对象是thread

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1? =" + thread.isInterrupted());
            System.out.println("是否停止2? =" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
