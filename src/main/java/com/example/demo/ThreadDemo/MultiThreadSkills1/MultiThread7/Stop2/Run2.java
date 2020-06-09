package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop2;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 21:32
 * @Description:
 */
public class Run2 {
//    线程有中断效果
//    测试当前线程是否已经中断，线程的中断状态已由该方法清除

    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println("是否停止1? =" + Thread.interrupted()); // true
        System.out.println("是否停止2? =" + Thread.interrupted()); // false
        System.out.println("end!");
    }
}
