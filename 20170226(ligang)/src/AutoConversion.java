
public class AutoConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 6;
		float f = a;
		System.out.println(f);//6.0
		byte b = 9;
//		char c = b;//byte型不能自动转成char类型
		double d = b;
		System.out.println(d);//9.0
		
	}

}
