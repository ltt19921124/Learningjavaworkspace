package WrapperDemo;

/*
 * 对一个字符数组值进行从小到大的排序
 * "20 78 9 -7 88 36 29"
 * 思路:
 * 	1，排序
 * 	2，如何获取到这个字符串中的这些需要排序的数值 
 * 发现这个字符串中其实都是空格来对数值进行分隔的
 * 所以就想到用字符串对象的切割方法来将字符串变成多个小串
 * 
 * 	3，数值最终变成小字符串，怎么变成一个int数呢？
 *   字符串--->基本数据类型可以使用包装类 
 * */

public class WrapperTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String numStr = "20  78 9 -7 88 36 29";
		
		System.out.println(numStr);
		numStr = sotrStringNumber(numStr);
		System.out.println(numStr);
		
		
	}

	public static String sotrStringNumber(String numStr) {
		
		
		//1,将字符串转成字符串数组
		//2，将字符串数组转成int数组
		//3，对int数组排序
		//4，将排序后的int数组转成字符串
		
		
		
		
		return null;
	}

}
