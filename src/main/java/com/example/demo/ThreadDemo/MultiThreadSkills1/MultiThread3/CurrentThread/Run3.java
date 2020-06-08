package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread3.CurrentThread;

/**
 * @Author: DiaoGR
 * @Date: 2020/6/8 22:14
 * @Description:
 */
public class Run3 {
//    如果在CountOperate类中存在this.getName()方法，则此方法使用的是CountOperate类自己的线程。

    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        t1.setName("A");
        t1.start();
    }
}
