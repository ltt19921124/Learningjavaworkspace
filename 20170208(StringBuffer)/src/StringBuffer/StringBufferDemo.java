package StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer就是字符串缓冲区
		 * 用于存储数据的容器(容器：数组(固定长度))
		 * 		特点：
		 * 			1，长度是可变的
		 * 			2，可以存储不同类型的数据
		 * 			3，最终要转成字符串进行使用
		 * 			4,可以对字符串进行修改
		 * 
		 * 		既然是一个容器，应该具备哪些功能？
		 * 			1，添加,(byte 和short类型数据不能存储)
		 * 				StringBuffer append(data) 默认大小16个字符
		 * 
		 * 			2，删除		
		 * 
		 * 
		 * 
		 * */
//		bufferMethodDemo();
		bufferMethodDemo_1();
	}

	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abcd");
		
		sb.append("xixi");
		System.out.println(sb.toString());//abcdxixi
		sb.insert(2, "qq");//插入字符串
		System.out.println(sb.toString());//abqqcdxixi
	}

	private static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
//		StringBuffer s1 = sb.append(4);
//		System.out.println(sb == s1);//true
//		System.out.println(s1);//4
		sb.append(4).append(false);//方法调用链(尾部添加)
//		System.out.println(sb);//4
//		System.out.println(sb.toString());//4
//		sb.append(true);
		System.out.println(sb);//4true
		sb.insert(1, "haha");
		System.out.println(sb);//4hahafalse
		
		
	}

}




