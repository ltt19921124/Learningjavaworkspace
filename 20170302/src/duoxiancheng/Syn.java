package duoxiancheng;

//ͬ������������this
/*ͬ��������ͬ�����������
 * ͬ����������this��
 * ͬ���������������Ķ���
 * ����ʹ��ͬ�������
 */
class Ticket1 implements Runnable{
	private int num = 400;
//	Object obj = new Object();
	boolean flag = true;
	public void run(){
		if(flag)
		while(true){
			synchronized(this){/*ͬ������java����ͬ���������ͬ������*/
				if(num>0){
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){
						
					}
					System.out.println(Thread.currentThread().getName()+"..sale"+num--);
				}
				else
					while(true)
						show();
			}
		}
	}
	public synchronized void show(){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){
				
			}
			System.out.println(Thread.currentThread().getName()+"..function"+num--);
		}
	}
}

class Syn {

	public static void main(String[] args) {
		Ticket1 t = new Ticket1();
		
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
	
		
		t1.start();
		t.flag = false;
		t2.start();
		
	}

}