package ���߳�Mars;

class RunnableImpl implements Runnable{
	public void run(){
		for(int i=0;i < 100;i++){
			System.out.println("Runnable-->" + i);
//			if(i == 50){
//				try{
//					Thread.sleep(5000);
//				}catch(Exception e){
//					System.out.println(e);
//				}
//			}
		}
	}
}

public class Thread_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunnableImpl ri = new RunnableImpl();
		Thread t = new Thread(ri);
//		t.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(2);//1
		System.out.println(t.getPriority());//5
		t.start();
		
//		for(int i = 0;i< 100;i++){
//			System.out.println("main-->" + i);
//		}
	}

}
