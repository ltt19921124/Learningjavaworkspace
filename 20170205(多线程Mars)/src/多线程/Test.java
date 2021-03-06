package 多线程;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//生成两个Thread对象，但是这两个Thread共用一个线程体
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);

		//线程都有名字，可以通过setName方法设置名字，也可以
		//通过getName方法得到线程名字
		t1.setName("线程a");
		t2.setName("线程b");
		//分别启动两个线程
		t1.start();
		t2.start();
	}

}
