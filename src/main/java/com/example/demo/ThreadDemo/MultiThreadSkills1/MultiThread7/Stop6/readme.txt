调用stop()方法时会抛出java.lang.ThreadDeath异常，但是在通常情况下，此异常不需要被显式的捕捉

方法stop()已经被作废，因为如果强制让线程停止可能使一些清理性工作得不到完成；
另外一个情况就是对锁定的对象进行了“解锁”，导致数据得不到同步的处理，出现数据不一致的问题