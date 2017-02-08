package string类;

public class StringObjectDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * intern()方法，可以对字符串池进行操作(规范化操作)
		 * F3可以在eclipse看源码
		 * */
		String s1 = "abc";
//		String s2 = "abc";
		String s3 = new String("abc");
		String s2 = s1.intern();//获取池中的数据，这时共享数据
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
//		System.out.println(s2);//abc
	}

}
