package ¶àÏß³Ì·è¿ñjava;

public class SecondThread implements Runnable{
	
	private int i;
	public void run(){
		for ( i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ".." + i);
			
		}
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + ".." + i);
			if(i == 20){
				SecondThread st = new SecondThread();
				Thread t1 = new Thread(st);
				Thread t2 = new Thread(st);
				
				t1.start();
				t2.start();
			}
		}

	}

}
