package xc;

class MyThread implements Runnable{

	/**
	 * @param args
	 */
	int i = 100;
	public void run(){
		while(true){
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() + i);
				i --;
				Thread.yield();
				if(i < 0){
					break;
				}
			}
		}
	}

}
