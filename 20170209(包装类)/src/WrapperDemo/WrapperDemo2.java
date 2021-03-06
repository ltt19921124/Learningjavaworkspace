package WrapperDemo;

public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 4;
		
		num = num + 5;
		
		Integer i = 4;// i = new Integer(4) 自动装箱	
//		Integer j = new Integer(4);
		i =  i + 6;//i = i + 6;
		
		Integer a = new Integer(127);
		
		Integer b = new Integer(127);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer x = 128;//JDK1.5以后，如果装箱的是一个字节，
		//那么该数据会共享不会重新开辟空间
		Integer y = 128;
		System.out.println(x==y);//true
		System.out.println(x.equals(y));//true
	}

}





