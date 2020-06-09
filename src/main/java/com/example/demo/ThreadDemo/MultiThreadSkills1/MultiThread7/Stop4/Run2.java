package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop4;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:53
 * @Description:
 */
public class Run2 {
//    先interrupt(),再sleep()
//    先停止，再遇到了sleep，进入catch

    public static void main(String[] args) {
        MyThread2 thread = new MyThread2();
        thread.start();
        thread.interrupt();
        System.out.println("end!");
    }
}
