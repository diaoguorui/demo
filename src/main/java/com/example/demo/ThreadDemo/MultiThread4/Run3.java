package com.example.demo.ThreadDemo.MultiThread4;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 23:16
 * @Description:
 */
public class Run3 {
    // 共享数据，线程安全

    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
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
