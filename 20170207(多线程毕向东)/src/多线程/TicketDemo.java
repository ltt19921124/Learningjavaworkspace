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
 * 		解决方式：将多条操作共享数据的线程代码封装起来，当有线程
 * 		在操作这些代码的时候，其他线程不能参与运算
 * 		必须要有当前线程把这些代码执行完毕后，其他线程才可以
 * 		参与运算。
 * 		
 * 		多线程同步的好处和弊端：
 * 			同步的好处：解决了线程的安全问题
 * 
 * 			同步的弊端：相对来讲降低了效率，因为同步外的线程都会判断同步锁
 * 			
 * 			同步的前提：	同步中必须有多个线程并使用用一个锁，
 * 
 * 			
 * 
 * 
 * */

package 多线程;

class Ticket extends Thread{
	
	private int num = 100;
	Object obj = new Object();
	public void run(){
		while(true){
			synchronized(obj){
				if(num>0){
//					try {
//						Thread.sleep(10);
//					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					System.out.println(Thread.currentThread().getName()+"..."+"sale..."+num--);
				}
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
