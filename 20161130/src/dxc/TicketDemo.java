
/**
 * 需求：卖票。
 * 
 * 
 * 
 * 
 */
/*
 * 线程安全问题产生的原因：
 * 	1，多个线程在操作共享的数据
 * 	2，操作共享数据的代码有多条
 * 
 * 当一个线程在执行操作共享数据的多条代码中，
 * 其他线程参与了运算，就会导致线程安全问题的产生
 * 
 * 解决方法：同步代码块
 * 
 * 就是将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码
 * 时，其他线程不能参与运算
 * 		必须要当前线程把这些代码都执行完毕后，其他线程才可以参与运算
 * 		同步代码块
 * 		格式
 * sychronized(){
 * 		需要被同步的代码块
 * }
 * 同步的好处：解决了线程的安全问题
 * 同步的弊端：相对降低了效率，因为同步外的线程都会判断同步锁
 * 
 * 同步的前提：同步中必须有多个线程并使用同一个锁
 * 		
 * */


package dxc;

	
class TicketDemo{
	public static void main(String [] args){
		Ticket t = new Ticket();
//		Ticket t2 = new Ticket();
//		Ticket t3 = new Ticket();
//		Ticket t4 = new Ticket();
		
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

