
public class NarrorConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iValue = 233;
		//强制把一个int类型的值转为byte型的值
		byte bValue = (byte) iValue;
		System.out.println(bValue);//-23
		
		double dValue = 3.98;
		
		int tol = (int)dValue;
		//强制把一个double类型的值转换成int，结果为3
		System.out.println(tol);//3
		
	}

}
