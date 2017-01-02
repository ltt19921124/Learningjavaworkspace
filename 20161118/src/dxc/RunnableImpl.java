package dxc;

public class RunnableImpl implements Runnable {

	/**
	 * @param args
	 */
	public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println("Runnable-->" + i);
			if(i == 50){
				try{
					Thread.sleep(200);
				}
				catch(Exception e){
					System.out.println(e);
				}
			}
		}
	}

}
