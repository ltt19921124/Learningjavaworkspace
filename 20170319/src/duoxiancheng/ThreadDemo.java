package duoxiancheng;

/**
 * @param args
 * 多线程优势：解决了多部分代码同时运行的问题
 * 多线程的弊端：线程太多会导致效率的降低
 * cpu切换速度特别快
 * 垃圾回收线程
 * 主线程
 * JVM启动时就启动了多个线程，至少有两个线程可以分析出来
 * 1，执行main函数的线程
 * 		代码在主函数中
 * 2，负责垃圾回收的线程
 * 		
 * 
 */
class Demo1 extends Object{
	public void finalize(){
		System.out.println("demo ok");
	}
}

class ThreadDemo {

	
	public static void main(String[] args) {
		new Demo1();
		new Demo1();
		System.gc();//不会立即启动
		new Demo1();
		System.out.println("hello");
	}

}




