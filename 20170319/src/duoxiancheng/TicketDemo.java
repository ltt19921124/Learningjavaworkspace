package duoxiancheng;

/*
 * ���߳���Ʊʾ��
 * 
 * ��̬������
 * ���̰߳�ȫ���� ������ԭ��
 * 1������߳���ͬʱ��������������
 * 2�������������ݵ��̴߳����ж���
 * ���˼·��ͬ��
 * 
 * ͬ��ǰ�᣺
 * ������
 * 
 * */

class Ticket implements Runnable{
	private int num = 100;
	Object obj = new Object();
	
	public void run(){
		while(true){
			synchronized(obj/**/){
				if(num > 0){
					try{Thread.sleep(10);}catch(InterruptedException e){}
					System.out.println(	Thread.currentThread().getName() + "...sale..." + num--);
				}
			}
		}
	}
}

class TicketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Ticket t = new Ticket();
//		Ticket tt = new 
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
//		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}