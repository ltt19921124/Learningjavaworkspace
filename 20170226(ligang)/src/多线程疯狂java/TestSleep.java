package 多线程疯狂java;

import java.util.Date;

public class TestSleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			System.out.println("当前时间:" + new Date());
			Thread.sleep(1000);
		}
	}

}
