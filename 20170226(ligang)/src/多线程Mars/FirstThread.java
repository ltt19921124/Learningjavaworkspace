package ���߳�Mars;

class FirstThread extends Thread{

	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("FirstThread-->" + ".." + i);
		}
	}
	
}
