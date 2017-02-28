
public class HelloWorld {

	/**
	 * @param args
	 * day01
	 * 0228 1248
	 */
	public static void main(String[] args) {
		//直接指定单个字符作为字符常量
		char aChar = 'a';
		System.out.println(aChar);
		//使用转义字符来作为字符常量
		char enterChar = '\r';
		System.out.println(enterChar);
		char ch = '\u9999';
		System.out.println(ch);
		char zhong = '中';
		int zhongValue = zhong;
		System.out.println(zhongValue);
		System.out.println("Hello java");
	}

}
