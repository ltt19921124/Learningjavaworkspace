package dxc;

public class Cus implements Runnable {

	/**
	 * @param args
	 */
	Bank b  = new Bank();
	public void run(){
		
		for (int i = 0; i < 3; i++) {
			b.add(100);
		}
	}

}
