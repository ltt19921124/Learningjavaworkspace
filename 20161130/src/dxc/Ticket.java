package dxc;

public class Ticket implements Runnable{

	/**
	 * @param args
	 */
	private int num = 100;
	Object obj = new Object();
	
	public void run(){
		while(true){
			synchronized (obj) {
				if(num > 0){
					System.out.println(Thread.currentThread().getName()+"...sale..." + num--);
				}	
			}
		}
	}

}
