package dxc;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableImpl ri = new RunnableImpl();
		
		Thread t = new Thread(ri);
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t.getPriority());
		t.start();
	
	}

}
