package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread4.IsAlive;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:28
 * @Description:
 */
public class Run2 {
//    注意Thread.currentThread()和this的差异

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive=" + t1.isAlive());
        t1.start();
        System.out.println("main end t1 isAlive=" + t1.isAlive());
    }
}
