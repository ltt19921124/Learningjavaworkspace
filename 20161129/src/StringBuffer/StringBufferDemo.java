package StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * StringBuffer:就是字符串缓冲区
		 * 用于存储数据的容器
		 * 
		 * 特点：
		 * 1，长度可变的
		 * 2，可以存储不同类型的数据
		 * 3,最终要转成字符串进行使用
		 * 4,可以对字符串进行修改
		 * 
		 * 具有以下方法：
		 * 		1，添加
		 * 		StringBuffer append(data);
		 * 
		 * 		2，删除
		 * 		StringBuffer delete(start,end);包含头，不包含尾
		 * 		StringBuffer deleteCharAt(int index);删除位置的元素
		 * 		
		 * 		3,查找
		 * 		char charAt(index)
		 * 		int indexOf(String)
		 * 		int lastIndexOf(String)
		 * 		
		 * 		4,修改
		 * 		StringBuffer replace(start,end)
		 * 		void setCharAt(index,char)
		 * 
		 * 		增删改查
		 * 		
		 * 		
		 * 		
		 */
//		bufferMethodDemo();
//		bufferMethodDemo1();
		bufferMethodDemo2();
	}
	private static void bufferMethodDemo2() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.delete(1,3);
//		sb.delete(0,sb.length());//清空缓冲区
//		sb.replace(1, 3, "nba");
//		sb.setCharAt(1, 'q');
//		System.out.println(sb);
//		sb.setLength(10);//添加空字符
		
//		System.out.println("sb:" + sb);
//		System.out.println("len:" + sb.length());
		
		System.out.println(sb.reverse());//反转字符串
	}
	private static void bufferMethodDemo1() {
		StringBuffer sb = new StringBuffer("abcd");
//		sb.append("xixi");
		sb.insert(2, "qq");//abqqcd
		System.out.println(sb.toString());
	}
	public static void bufferMethodDemo(){
		//创建缓冲区对象
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(false);//.append("haha");
		sb.insert(1, "haha");
//		sb.append(true);//4true
		System.out.println(sb);
//		System.out.println(s1);
		
	}

}
