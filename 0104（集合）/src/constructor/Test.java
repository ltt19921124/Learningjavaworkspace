package constructor;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		A a = new A();
		/*
		a.funA();
		a.funA(10);
		a.funA(1,2.0);
		*/
		Person p = new Person("zhangsan",10);
		
		Person p2 = new Person("lisi",20);
		System.out.println("p��name��:" + p.name);
		System.out.println("p2��name��:" + p2.name);
	}

}
