package duoxiancheng;

/*
 * ����������ÿ����ȥ���д�Ǯ��ÿ�δ�100���ֱ������
 *  
 *  
 * ͬ��������ͬ�����������Ա�֤ͬ��
 * ͬ����������
 * 
 * */

class Bank{
	private int sum;
	private Object obj = new Object();
	public synchronized void add(int num){//ͬ������
//		synchronized (obj) {
			sum = sum + num;
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				
			}
			System.out.println("sum="+sum);
//		}
	}
}

class Cus implements Runnable{
	private Bank b = new Bank();
	public void run(){
		for(int i=0;i<3;i++){
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



