package WrapperDemo;

public class WrapperDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 基本 数据类型包装类：
		 * 	为了方便基本数据类型值，将其封装成了对象，在对象中定义了
		 * 属性和行为丰富了该数据的操作，用于描述该对象的类就称为基本数据类型包装类
		 * 
		 * byte   	Byte
		 * short  	Short
		 * int    	Integer
		 * long   	Long
		 * float  	Float
		 * double 	Double
		 * char   	Character
		 * boolean 	Boolean
		 * 
		 * 该包装对象只要用于基本数据类型和字符串之间的转换
		 * 
		 * 基本类型--->字符串
		 * 		1，基本数据数值+""
		 * 		2,用String类中的静态方法valueOf(基本类型数值)
		 * 		3,用Integer静态方法valueOf()(基本类型数值)
		 * 字符串-->基本类型
		 * 		1，使用包装类静态方法   xxx parsXxx("xxx类型的字符串")	
		 * 		  int parseInt("int类型的字符串");
		 * 		  long parsLong("longstring");
		 * 		  boolean parseBoolean("booleanstring");
		 * 		  Character没有parse方法
		 * 		2，如果字符串被Integer进行对象的封装
		 * 			可以使用另一个静态方法intValue()将一个
		 * 			Integer对象转成基本数据类型值
		 * 
		 * */
//		int num;
		
//		System.out.println(Integer.MAX_VALUE);//2147483647
//		System.out.println(Integer.MIN_VALUE);//-2147483648
//		num = 4;
//		System.out.println(Integer.toBinaryString(-6));//11111111111111111111111111111010
//		Integer i = new Integer(5);//
//		int x = Integer.parseInt("123");//123
//		System.out.println(Integer.parseInt("123") + 1);//整数124
//		String s = "";
//		String s1 = s.valueOf(123);
//		System.out.println(s1);
		
//		if(Boolean.parseBoolean("true")){
//			System.out.println(true);//true
//		}
		
//		Integer i = new Integer("123");
//		System.out.println(i.intValue());//123(整数)
		/*
		 * 整数具备这不同的进制
		 * 
		 * 十进制--->其他进制
		 * 		toBinaryString	
		 * 		toOctalString
		 * 		toHexString
		 * 
		 * 
		 * 其他进制--->十进制
		 * 		parseInt("string",radix);
		 * 
		 * 
		 * */
		//十进制--->其他进制
//		System.out.println(Integer.toBinaryString(60));//111100
//		System.out.println(Integer.toOctalString(60));//74
//		System.out.println(Integer.toHexString(60));//3c
//		
//		System.out.println(Integer.toString(60,16));//3c
		//其他进制--->十进制
//		
//		System.out.println(Integer.parseInt("3c",16));//60
		
//		Integer a = new Integer("5");
//		Integer b = new Integer(3);
//		
//		System.out.println(a==b);//false
//		System.out.println(a.equals(b));//true
		
//		System.out.println(a.compareTo(b));//1
		
		Integer a = new Integer("5");
		Integer b = new Integer(300);
		System.out.println(a.compareTo(b));//-1
		
	}

}


