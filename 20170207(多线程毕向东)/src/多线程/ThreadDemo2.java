/*
 * 
 * 
 * */

package 多线程;

class Demo_1 extends Thread {
	private String name;

	Demo_1(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(name + "...i=" + i+"..." +Thread.currentThread().getName());
		}
	}
}

public class ThreadDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Demo_1 d1 = new Demo_1("旺财");
		Demo_1 d2 = new Demo_1("xiaoqiang");
		d1.start();
		d2.start();
		System.out.println("over"+"..."+Thread.currentThread().getName());
	}

}
