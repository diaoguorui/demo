package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread7.Stop7;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 22:17
 * @Description:
 */
public class MyThread extends Thread {
    private SynchornizedObject object;

    public MyThread(SynchornizedObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b", "bb");
    }
}
