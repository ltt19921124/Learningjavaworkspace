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
	 * ���󣺴�����������ÿ���˶�ȥ��Ǯÿ�δ�100����������
	 * 
	 */
	

}
