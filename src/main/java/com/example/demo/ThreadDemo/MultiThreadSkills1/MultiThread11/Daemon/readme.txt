在java线程中有两种线程，一种是用户线程，另一种是守护（Daemon）线程

定义：
守护线程是一种特殊的线程，它的特性有陪伴的含义，当进程中没有非守护线程了，
则守护线程自行销毁

案例：
典型的守护线程就是垃圾回收线程，当进程中不存在非守护线程了，则垃圾回收线程
也就没有存在的必要了，自动销毁