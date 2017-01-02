package nbl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a = new A();
//		A.B b = a.new B();
//		
//		a.i = 3;
//		b.j = 4;
//		int result = b.funB();
//		System.out.println(result);
//		AImpl al = new AImpl();
//		A a = al;
		
		B b = new B();
		b.fun(new A(){
			public void dosomeThing(){
				System.out.println("ÄäÃû");
			}
		});
	}

}
