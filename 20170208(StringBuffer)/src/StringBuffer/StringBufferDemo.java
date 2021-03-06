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
		 * 				StringBuffer insert(index,data);
		 * 			2，删除	
		 * 				StringBuffer delete(start,end);包含头，不包含尾	
		 * 				StringBuffer deleteCharAt(int index);//删除指定位置元素
		 * 			3,查找：
		 * 				char charAt(index)
		 * 				int indexOf(String)
		 * 				int lastIndexOf(String) 
		 * 
		 * 			4,修改
		 * 				StringBuffer replace(start,end,string);
		 * 
		 * 			增删改查:C(create)U(update)R(read)D(delete)
		 * 			
		 * 			
		 * 
		 * */
//		bufferMethodDemo();
//		bufferMethodDemo_1();
		bufferMethodDemo_2();
	}

	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);
//		System.out.println(sb);//ae不包含尾
		
		//清空缓冲区
//		sb.delete(0, sb.length());
		
//		sb = new StringBuffer();
		
//		System.out.println(sb);//清空缓冲区
//		sb.replace(1, 2, "nba");
//		System.out.println(sb);//anbace
//		sb.replace(1, 2, "nba");
//		System.out.println(sb);//anbabace
//		sb.setCharAt(2, 'q');
//		System.out.println(sb);//abqe
//		sb.setLength(2);
//		System.out.println("sb:" + sb);//sb:ab
//		System.out.println("len:" + sb.length());//len:2
//		sb.setLength(10);
//		System.out.println("sb:" + sb);//sb:abce(空字符)
//		System.out.println("len:" + sb.length());//len:10
		System.out.println(sb.reverse());//ecba
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




