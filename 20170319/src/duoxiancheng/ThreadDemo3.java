package duoxiancheng;

class Demo3 implements Runnable{
	public void run(){
		for(int i =0;i < 10;i++){
			System.out.println(i + Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		t1.start();
		t2.start();
		
	}

}




