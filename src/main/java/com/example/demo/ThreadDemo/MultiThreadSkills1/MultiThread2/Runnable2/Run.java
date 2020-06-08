package com.example.demo.ThreadDemo.MultiThreadSkills1.MultiThread2.Runnable2;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:52
 * @Description:
 */
public class Run {
    /*构造函数Thread(Runnable target)不光可以传入Runnable接口的对象，也可以传入一个Thread类的对象，这样做完全可以将一个
    Thread对象中的run()方法交由其他的线程进行调用*/

    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
