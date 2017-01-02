package bzl;

public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 基本数据类型包装类
		 * 为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和
		 * 行为丰富了该数据的操作
		 * 用于描述该对象的类就称为基本数据类型对象包装类
		 * 
		 * byte 		Byte
		 * short		Short
		 * int 			Integer
		 * long			Long
		 * float		Float
		 * double		Double
		 * char			Character
		 * boolean		Boolean
		 * 
		 * 
		 */
//		int num;
		
//		System.out.println(Integer.MAX_VALUE);
		
//		System.out.println(Integer.toBinaryString(-6));
		
		int num = 4;
		Integer i = new Integer(num);
		
		int x = Integer.parseInt("123")+1;
		System.out.println(x);
	}

}
