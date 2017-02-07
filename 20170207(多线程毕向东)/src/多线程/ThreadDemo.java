package 多线程;
/*
 * 进程：正在运行的程序
 * 线程：就是进程中的一个负责程序执行的控制单元(执行路径)
 * 一个进程中可以有多个执行路径：称为多线程
 * 
 * 开启多个线程是为了同时执行多部分代码
 * 
 * 每一个线程都有自己运行的内容，这部分内容可以称为线程要运行的任务
 * 多线程好处：解决了多部分同时运行的问题
 * 多线程的弊端：线程太多会导致效率的降低
 * 
 * JVM启动时就启动了多个线程，至少有两个线程分析的出来
 * 
 * 1，执行main函数的线程
 * 		该部分代码都都定义在main函数中
 * 2，
 * 		负责垃圾回收的线程
 * 		每个对象都有被回收的可能
 * */

class Demo extends Object{
	public void finalize(){
		System.out.println("demo ok");
	}
}

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo();
		new Demo();
		System.gc();
		new Demo();
		System.out.println("hello");
	}

}
