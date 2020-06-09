package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread8.Suspend3;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/9 23:00
 * @Description:
 */
public class Run {
    public static void main(String[] args) {
        try {
            final MyObject object = new MyObject();
            Thread thread1 = new Thread() {
                public void run() {
                    object.setValue("a", "aa");
                }
            };
            thread1.setName("a");
            thread1.start();

            Thread.sleep(500);

            Thread thread2 = new Thread() {
                public void run() {
                    object.printUsernamePassword();
                }
            };
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
