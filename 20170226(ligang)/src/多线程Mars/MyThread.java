package ���߳�Mars;

public class MyThread implements Runnable{

	int i  = 10;
	public void run(){
		while(true){
			synchronized (this) {
				System.out.println(Thread.currentThread().getName() +".."+ i);
				i --;
				Thread.yield();
				if(i < 0){
					break;
				}
			}
		}
	}
}
