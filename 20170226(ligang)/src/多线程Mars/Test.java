package 多线程Mars;

public class Test {

	
	public static void main(String[] args) {
//		FirstThread ft = new FirstThread();
//		ft.start();
//		RunnableImpl ri = new RunnableImpl();
//		Thread t = new Thread(ri);
//		t.setPriority(Thread.MIN_PRIORITY);
//		int a = t.getPriority();
//		System.out.println(a);
//		System.out.println(t.getPriority());
//		t.start();
//		for (int i = 0; i < 10; i++) {
//			System.out.println(Thread.currentThread().getName() + ".." + i);
//		}
		
		MyThread mt = new MyThread();
		
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		t1.setName("线程A");
		
		t1.start();
		t2.start();
	}

}







