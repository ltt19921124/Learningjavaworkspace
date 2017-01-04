package Static;

public class Test {

	/**
	 * @param args
	 * 静态变量：既可以用类名调用，也可以用
	 * 对象调用
	 * 
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.i = 10;
		
		System.out.println("p1的i值为："+ p1.i);
		System.out.println("p2的i值为：" + p2.i);
	}

}
