package ���߳�;
/*
 * ���̣��������еĳ���
 * �̣߳����ǽ����е�һ���������ִ�еĿ��Ƶ�Ԫ(ִ��·��)
 * һ�������п����ж��ִ��·������Ϊ���߳�
 * 
 * ��������߳���Ϊ��ͬʱִ�жಿ�ִ���
 * 
 * ÿһ���̶߳����Լ����е����ݣ��ⲿ�����ݿ��Գ�Ϊ�߳�Ҫ���е�����
 * ���̺߳ô�������˶ಿ��ͬʱ���е�����
 * ���̵߳ı׶ˣ��߳�̫��ᵼ��Ч�ʵĽ���
 * 
 * JVM����ʱ�������˶���̣߳������������̷߳����ĳ���
 * 
 * 1��ִ��main�������߳�
 * 		�ò��ִ��붼��������main������
 * 2��
 * 		�����������յ��߳�
 * 		ÿ�������б����յĿ���
 * */

class Demo extends Object{
	public void finalize(){
		System.out.println("demo ok");
	}
}

public class ThreadDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Demo();
		new Demo();
		System.gc();
		new Demo();
		System.out.println("hello");
	}

}
