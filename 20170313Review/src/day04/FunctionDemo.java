package day04;

public class FunctionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c;
		
//		c = 5 + 7;
//		c = 9 + 8;
		c = add(3);
		System.out.println("c=" + c);
		myPrint();
		
	}

	private static void myPrint() {
		System.out.println("hello world");
	}

	public static int add(int i) {
		
		return i + 7;
	}
	
}
