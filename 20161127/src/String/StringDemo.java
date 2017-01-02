package String;

public class StringDemo {

	/**
	 * @param args
	 */
	/*
	 * String类特点：
	 * 字符串对象初始化后就不会改变。
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2();
	}
	private static void StringDemo2() {
		// TODO Auto-generated method stub
		String s = "abc";//在常量池中，可共享
		String s1 = new String("abc");//创建两个对象
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));//String类中的equals复写了Object
		//类中的equals，其实就是比较内容
	}
	/* 
	 *演示定义字符串定义的第一种方式，并明确
	 *常量池，池中没有建立，有，直接用
	 * 
	 */
	private static void StringDemo1() {
		String s = "abc";
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true
		System.out.println("s=" + s);//打印出s=nba
	}

}
