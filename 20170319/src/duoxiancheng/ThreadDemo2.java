package duoxiancheng;
/*
 * �����̷߳�ʽһ��
 * 1������һ����̳�Thread��
 * 2������Thread���е�run���������̴߳����װ��run������
 * 3�������������
 * 4������start����
 * ע�⣬���ܵ���run������Ҫ����start()����
 * getName��ȡ�߳�����
 * ���߳�������main
 * 
 * 
 * */
class Demo extends Thread{
	private String name;
	Demo(String name){
		super(name);
//		this.name = name;
	}
	public void run(){
		for (int i = 0; i < 10; i++) {
			
			System.out.println(name + "...i=" + i +"..." +Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo d1 = new Demo("����");
		Demo d2 = new Demo("xiaoqiang");
		d1.start();//�����̣߳������̻߳����ִ��
		d2.start();
		
		System.out.println(4/0);//throw new 
		
		for(int i = 0;i < 20;i++){
			System.out.println(i + "...over..." + Thread.currentThread().getName());
		}
	}

}