package Static;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.i = 10;
		
		System.out.println("p1的i值为："+ p1.i);
		System.out.println("p2的i值为：" + p2.i);
	}

}
