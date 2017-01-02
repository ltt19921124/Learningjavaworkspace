package dxc;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 创建线程的第二种方法：实现runnable接口
		 * 实现Runnable接口的好处：
		 * 1，将线程的任务从线程的子类中分离出来，进行了单独的封装
		 * 
		 * 2，避免了java单继承的局限性
		 * 所以，创建线程的第二种方式较为常用
		 * 
		 */
//		Demo d1 = new Demo("旺财");
//		Demo d2 = new Demo("xiaoqiang");
//		d1.start();
//		d2.start();
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		t1.start();
		t2.start();
	}

}
