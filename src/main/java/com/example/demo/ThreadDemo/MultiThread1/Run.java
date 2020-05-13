package com.example.demo.ThreadDemo.MultiThread1;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:06
 * @Description:
 */
public class Run {
// 在使用多线程时，代码的运行结果与代码执行顺序无关

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
