package duoxiancheng;
/*
 * 创建线程方式一：
 * 1，定义一个类继承Thread类
 * 2，覆盖Thread类中的run方法，将线程代码封装到run方法中
 * 3，创建子类对象
 * 4，调用start方法
 * 注意，不能调用run方法，要调用start()方法
 * getName获取线程名称
 * 主线程名字是main
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
		Demo d1 = new Demo("旺财");
		Demo d2 = new Demo("xiaoqiang");
		d1.start();//开启线程，两个线程会随机执行
		d2.start();
		
		System.out.println(4/0);//throw new 
		
		for(int i = 0;i < 20;i++){
			System.out.println(i + "...over..." + Thread.currentThread().getName());
		}
	}

}
