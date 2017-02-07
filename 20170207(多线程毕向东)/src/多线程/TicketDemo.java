/*
 * 售票演示“
 * 
 * 线程安全问题
 * 
 * 线程安全问题出现的原因？
 * 		1，多个线程在操作共享的数据。
 * 		2，操作共享数据的代码有多条
 * 
 * 		当一个线程在执行操作共享数据的多条代码时，其他的线程
 * 		参与了运算。就会导致安全问题的产生。
 * 
 * */

package 多线程;

class Ticket extends Thread{
	
	private int num = 100;
	
	public void run(){
		while(true){
			if(num>0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
