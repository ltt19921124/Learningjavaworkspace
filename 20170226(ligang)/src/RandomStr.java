
public class RandomStr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//定义一个字符串
		String result = "";
		//调用Math的random方法，会生成一个伪随机数
		System.out.println((int)(Math.random()*10));
		
		for (int i = 0; i < 6; i++) {
			int intVal = (int) (Math.random() * 26 +97);
			result = result + (char) intVal;
			
		}
		System.out.println(result);
		String a = "45";
		int iValue = Integer.parseInt(a);
		System.out.println(iValue);
		System.out.println(Math.sqrt(4));
//		System.out.println(Math.random());
		double e = Math.sin(1.57);
		System.out.println(e);
	}
}





