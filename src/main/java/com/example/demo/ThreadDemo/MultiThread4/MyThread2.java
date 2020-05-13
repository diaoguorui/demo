package com.example.demo.ThreadDemo.MultiThread4;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 23:07
 * @Description:
 */
public class MyThread2 extends Thread {
    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
//        此示例不要用for语句，因为使用同步后其他线程就得不到运行的机会了，一直由一个线程进行减法运算
        System.out.println("由" + this.currentThread().getName() + " 计算， count=" + count);
    }
}
