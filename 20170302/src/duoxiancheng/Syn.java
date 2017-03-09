package duoxiancheng;

//同步函数的锁是this
/*同步函数和同步代码块区别：
 * 同步函数锁是this，
 * 同步代码块锁是任意的对象
 * 建议使用同步代码块
 */
class Ticket1 implements Runnable{
	private int num = 400;
//	Object obj = new Object();
	boolean flag = true;
	public void run(){
		if(flag)
		while(true){
			synchronized(this){/*同步，在java中用同步代码块解决同步问题*/
				if(num>0){
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){
						
					}
					System.out.println(Thread.currentThread().getName()+"..sale"+num--);
				}
				else
					while(true)
						show();
			}
		}
	}
	public synchronized void show(){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				
			}
			System.out.println(Thread.currentThread().getName()+"..function"+num--);
		}
	}
}

class Syn {

	public static void main(String[] args) {
		Ticket1 t = new Ticket1();
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
	
		
		t1.start();
		t.flag = false;
		t2.start();
		
	}

}
