package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop7;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:18
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            SynchornizedObject object = new SynchornizedObject();
            MyThread thread = new MyThread(object);
            thread.start();
            Thread.sleep(500);
            thread.stop();
            System.out.println(object.getUaername() + " " + object.getPassword());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
