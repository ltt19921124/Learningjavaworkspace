package join;

import java.util.Date;

public class TestSleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i < 10;i++){
			System.out.println("��ǰʱ�䣺" + new Date());
			Thread.sleep(1000);
		}
	}

}
