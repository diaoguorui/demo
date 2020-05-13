package com.example.demo.ThreadDemo.MultiThread2;

/**
 * @Author: DiaoGR
 * @Date: 2020/5/13 22:27
 * @Description:
 */
public class Run {
    /*Thread.java类中的start()方法通知线程规划器，此线程已经准备就绪，等待调用线程对象的run方法。这个过程其实就是让系统
      安排一个时间来调用Thread中的run()方法，也就是使线程得到运行，启动线程，具有异步执行的效果。
    如果调用代码thread.run()就不是异步执行了，而是同步，那么此线程对象并不交给线程规划器来进行处理，而是由main主线程来调用
    run()方法，也就是必须等run()方法中的代码执行完后才可以执行后面的代码。*/


    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.setName("myThread");
            thread.start();

            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        try {
//            MyThread thread = new MyThread();
//            thread.setName("myThread");
//            thread.run();
//
//            for (int i = 0; i < 10; i++) {
//                int time = (int) (Math.random() * 1000);
//                Thread.sleep(time);
//                System.out.println("main=" + Thread.currentThread().getName());
//            }
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
}
