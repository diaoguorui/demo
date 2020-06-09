package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:51
 * @Description:
 */
public class Run2 {
//    "main end"没有被打印，因为当程序运行到println方法内部停止时，同步锁未被释放，导致println方法一直呈现“暂停状态”

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
