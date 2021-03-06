package 多线程;

/*
 * 需求：两储户，存钱每次存100，共存3次
 * */

class Bank{
	private int sum;
//	Object obj = new Object();
	public synchronized void add(int num){//同步函数
//		synchronized(obj){
			sum= sum + num;
			System.out.println("sum=" + sum);
//		}
	}
}

class Cus implements Runnable{
	private Bank b = new Bank();//共享数据
	public void run(){
		for(int x=0;x<3;x++){
			b.add(100);
		}
	}
}

public class BankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cus c = new Cus();
		
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
	}

}
