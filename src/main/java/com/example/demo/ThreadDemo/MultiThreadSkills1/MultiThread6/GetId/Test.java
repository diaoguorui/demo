package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread6.GetId;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 20:09
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " " + t.getId());
    }
}
