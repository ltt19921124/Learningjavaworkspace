package join;

public class JoinThread extends Thread{
	
	public JoinThread(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0;i < 100;i++){
			System.out.println(getName() + "..." + i);
		}
	}
	
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		new JoinThread("���߳�").start();
		for(int i=0;i < 100;i++){
			if(i == 20){
				JoinThread jt = new JoinThread("��Join���߳�");
				jt.start();
				jt.join();
			}
			System.out.println(Thread.currentThread().getName()+"..." + i);
		}
	}

}






