package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread4.IsAlive;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:20
 * @Description:
 */
public class Run {
//    end这一行代码打印的结果是true，但是此值是不确定的，打印true是因为myThread线程还未执行完毕。
//    如果让main线程休眠一段时间再打印，结果可能就是false

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
        System.out.println("end == " + myThread.isAlive());
    }
}
