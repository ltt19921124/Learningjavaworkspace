package dxc;

public class Bank {
	private int sum;
	private Object obj = new Object();
	public void add(int num){
		synchronized (obj) {
			sum = sum + num;
			System.out.println("sum=" + sum);
		}
	}

	/**
	 * @param args
	 * 需求：储户，两个，每个人都去存钱每次存100，各存三次
	 * 
	 */
	

}
