package 多线程;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		//生成两个Thread对象
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.setName("线程a");
		t2.setName("线程b");
		
		t1.start();
		t2.start();
	}

}
