package 多线程Mars;

/*
 * 多进程：
 * 		在操作系统中，同时运行多个任务
 * 
 * 多线程：
 * 		在同一应用程序中，有多个顺序流同时执行
 * 
 * java中有两种实现多线程的方法
 * 
 * 方法一：
 * 		定义一个类继承Thread类，复写Thread中的run()方法，
 * 		把代码放在run()方法中，run()就是线程体
 * 方法二：
 * 		
 * */
class FirstThread extends Thread {
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("ft-->" + i);
		}
	}
}

public class Thread_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstThread ft = new FirstThread();
		ft.start();
		for(int i=0;i<100;i++){
			System.out.println("main-->"+i);//1，主线程2，ft线程3，垃圾回收线程
		}
	}

}
