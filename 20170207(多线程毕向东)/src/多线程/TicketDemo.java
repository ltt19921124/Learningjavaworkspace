package ���߳�;

class Ticket extends Thread{
	
	private int num = 100;
	
	public void run(){
		while(true){
			if(num>0){
				System.out.println(Thread.currentThread().getName()+"..."+"sale..."+num--);
			}
		}
	}
}

public class TicketDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
//		t1.start();
//		t1.start();
//		t1.start();
//		t1.start();
	}

}
