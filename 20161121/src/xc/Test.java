package xc;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread myThread = new MyThread();
		Thread t1 = new Thread(myThread);
		Thread t2 = new Thread(myThread);
		
		t1.setName("线程a");
		t2.setName("线程b");
		
		t1.start();
		t2.start();
		
	}

}
