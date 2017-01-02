package java;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.i = 10;
		p1.i = 20;
		System.out.println("p1的i的值为" + p1.i);
		System.out.println("p2的i的值为" + p2.i);
	}

}
