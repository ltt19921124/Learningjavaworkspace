
public class NarrorConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int iValue = 233;
		//ǿ�ư�һ��int���͵�ֵתΪbyte�͵�ֵ
		byte bValue = (byte) iValue;
		System.out.println(bValue);//-23
		
		double dValue = 3.98;
		
		int tol = (int)dValue;
		//ǿ�ư�һ��double���͵�ֵת����int�����Ϊ3
		System.out.println(tol);//3
		
	}

}
