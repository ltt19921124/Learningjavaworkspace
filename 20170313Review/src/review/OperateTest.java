package review;

public class OperateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println(2 << 3);//16
		/*
		int a = 3,b = 5;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);
		
		a = a ^ b;//^:��ͬ��Ϊ1
		b = a ^ b;
		a = a ^ b;
		System.out.println("a=" + a + ",b=" + b);
		*/
		int num = 61;
		int n1 = num & 15;
		int n2 = num & (15 << 4);
		
		int n = n1 << 4 | n2 >>> 4;
		System.out.println("n=" + n);
		
	}

}



