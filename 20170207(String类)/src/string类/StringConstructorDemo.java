package string类;

public class StringConstructorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		StringConstructorDemo();
		StringConstructorDemo_2();
//		byte[] arr = {65,66,67,68};
//		
//		String s1 = new String(arr);//能将字节数组变成字符串
//		System.out.println("s1=" + s1);//ABCD
	}

	private static void StringConstructorDemo() {
		String s = new String();//等效于string s = "";不等效于String s = null;
		
		
	}
	private static void StringConstructorDemo_2(){
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr);//s=wapqx
		String s1 = new String(arr,2,3);//从2角标开始取，取3个
		
		System.out.println("s=" + s);//可以把字符数组转成字符串
		System.out.println("s1=" + s1);//s1=apq
	}

}








