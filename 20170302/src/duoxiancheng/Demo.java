package duoxiancheng;

public class Demo extends Thread {

	private String name;

	Demo(String name) {
		super(name);
//		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + "..i" + i+ "name=" + Thread.currentThread().getName());
		}
	}

}
