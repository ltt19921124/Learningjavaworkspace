package duoxiancheng;

/**
 * @param args
 * ���߳����ƣ�����˶ಿ�ִ���ͬʱ���е�����
 * ���̵߳ı׶ˣ��߳�̫��ᵼ��Ч�ʵĽ���
 * cpu�л��ٶ��ر��
 * ���������߳�
 * ���߳�
 * JVM����ʱ�������˶���̣߳������������߳̿��Է�������
 * 1��ִ��main�������߳�
 * 		��������������
 * 2�������������յ��߳�
 * 		
 * 
 */
class Demo1 extends Object{
	public void finalize(){
		System.out.println("demo ok");
	}
}

class ThreadDemo {

	
	public static void main(String[] args) {
		new Demo1();
		new Demo1();
		System.gc();//������������
		new Demo1();
		System.out.println("hello");
	}

}




