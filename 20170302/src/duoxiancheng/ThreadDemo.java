package duoxiancheng;

public class ThreadDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	/*
	 *获取线程名称：Thread.currentThread.getNmae():Thread-0
	 * 
	 * */
	public static void main(String[] args) {
		Demo d1 = new Demo("小强");
		Demo d2 = new Demo("wangcai");
		d1.start();
		d2.start();
//		Thread.sleep(1000);
		System.out.println("over:"+Thread.currentThread().getName());
	}

}
