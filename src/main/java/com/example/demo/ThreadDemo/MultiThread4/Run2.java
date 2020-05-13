package com.example.demo.ThreadDemo.MultiThread4;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 23:09
 * @Description:
 */
public class Run2 {
    // 共享数据，非线程安全

    public static void main(String[] args) {
        MyThread2 myThread = new MyThread2();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");
        Thread e = new Thread(myThread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
