判断线程是否在停止状态
this.interrupted(): 测试当前线程是否已经中断，执行后具有将状态标志清除为false的功能；当前线程是指运行this.interrupted()的线程
this.isInterrupted(): 测试线程Thread对象是否已经是中断状态，但不清除状态标志
线程运行结束后，会清除线程中断状态