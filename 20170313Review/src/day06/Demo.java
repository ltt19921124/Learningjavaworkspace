package day06;

public class Demo {

	/**
	 * @param args
	 */
	int x = 3;
	public static void main(String[] args) {
		Demo d = new Demo();
		d.x = 9;
		show(d);
		System.out.println(d.x);
	}
	public static void show(Demo d){
		d.x = 10;
	}

}
