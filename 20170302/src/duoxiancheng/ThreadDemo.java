package duoxiancheng;

public class ThreadDemo {

	/**
	 * @param args
	 */
	/*
	 *��ȡ�߳����ƣ�Thread.currentThread.getNmae():Thread-0
	 * 
	 * */
	public static void main(String[] args) {
		Demo d1 = new Demo("Сǿ");
		Demo d2 = new Demo("wangcai");
		d1.start();
		d2.start();
		System.out.println("over:"+Thread.currentThread().getName());
	}

}