package String;

public class StringConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		StringConstructorDemo();
		StringContructorDemo2();
		
	}

	private static void StringContructorDemo2() {
		char[] arr = {'w','a','p','x'};
		String s = new String(arr,1,3);
		
		System.out.println("s=" + s);
	}

	private static void StringConstructorDemo() {
		String s = new String();//String s = "";不等效于String s = null;
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1=" + s1);
	}

	

}
 