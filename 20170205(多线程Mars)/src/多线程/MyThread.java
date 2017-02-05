package 多线程;

public class MyThread implements Runnable{

	/**
	 * @param args
	 */
	int i = 100;
	public void run(){
		synchronized(this){//this代表一个对象
			while(true){
				System.out.println(Thread.currentThread().
					getName()+i);
				i--;
				Thread.yield();
				if(i<0){
					break;
				}
			}
		}
	}

}
