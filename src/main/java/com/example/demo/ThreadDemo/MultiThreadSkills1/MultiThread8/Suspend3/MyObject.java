package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:57
 * @Description:
 */
public class MyObject {
    private String username = "1";
    private String password = "11";

    public void setValue(String u, String p) {
        this.username = u;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("停止a线程！");
            Thread.currentThread().suspend();
        }
        this.password = p;
    }

    public void printUsernamePassword() {
        System.out.println(username + " " + password);
    }
}
