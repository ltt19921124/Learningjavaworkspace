package dxc;

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * �����̵߳ĵڶ��ַ�����ʵ��runnable�ӿ�
		 * ʵ��Runnable�ӿڵĺô���
		 * 1�����̵߳�������̵߳������з�������������˵����ķ�װ
		 * 
		 * 2��������java���̳еľ�����
		 * ���ԣ������̵߳ĵڶ��ַ�ʽ��Ϊ����
		 * 
		 */
//		Demo d1 = new Demo("����");
//		Demo d2 = new Demo("xiaoqiang");
//		d1.start();
//		d2.start();
		Demo d1 = new Demo();
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d1);
		t1.start();
		t2.start();
	}

}
