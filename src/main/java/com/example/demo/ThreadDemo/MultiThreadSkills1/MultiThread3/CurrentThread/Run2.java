package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread3.CurrentThread;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:09
 * @Description:
 */
public class Run2 {
//    调用start方法时，MyThread类的构造函数是被main线程调用的，run方法是被名称为Thread-0的线程调用的。
//    调用run方法时，均是被main线程调用的。

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
//        myThread.start();
        myThread.run();
    }
}
