package string类;

import java.util.Arrays;

public class StringMethodDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 字符串常见功能分类 "abcd" 
		 * 1，获取 
		 * 1.1获取字符串长度： 
		 * 		int length();
		 * 
		 * 1.2根据位置获取字符：
		 * 		char charAt(int index)
		 * 
		 * 1.3根据字符获取位置: 
		 * 		int indexOf(int ch) 
		 * 		int indexOf(int ch,int fromIndex)//从指定位置找 
		 * 		int indexOf(String str) 
		 * 		int indexOf(String str,int fromIndex) 
		 * 
		 * 根据字符串获取位置 
		 * 		int lastIndexOf(int ch) 
		 * 		int lastIndexOf(intch,int fromIndex)//从指定位置找 
		 * 		int lastIndexOf(String str) 
		 * 		int lastIndexOf(String str,int fromIndex)
		 * 
		 * 1.4获取字符串中的一部分字符串(也叫子串)。
		 * 	String subString(int beginIndex int endIndex )
		 * 	String subString(int beginIndex)
		 * 
		 * 2,转换
		 * 	2,1 将字符串变成字符串数组(字符串切割)
		 * 		String[] split(String regex)//涉及到正则表达式			
		 * 	2,2 将字符串变成字符数组	
		 * 		char[] toCharArray()
		 * 	2,3将字符串转成字节数组
		 * 		byte[] getBytes();
		 * 	2,4将字符串中的字符转成大小写
		 * 		String toUperCase();大写		
		 * 		String toLowerCase();小写
		 * 	2,5将字符串中的内容进行替换
		 * 		String replace(char oldch,char newch);
		 * 		String replace(String s1,String s2);
		 * 
		 * 		
		 * 
		 * 
		 */
//		stringMethodDemo_1();
		stringMethodDemo_2();

	}

	private static void stringMethodDemo_2() {
		String s = "张三,李四,王五";
//		String[] arr = s.split(",");//","就是规则//
		String[] arr = s.split("\\.");//"."是特殊符号，要转义"\\."
		for(int i = 0;i < arr.length;i++){
//			System.out.println(arr[i]);
		}
		char[] chs = s.toCharArray();
		for(int i=0;i<chs.length;i++){
//			System.out.println(chs[i]);
		}
		s = "ab你";
		byte[] bytes = s.getBytes();
		for(int i =0;i<bytes.length;i++){
//			System.out.println(bytes[i]);//
			/*
			98
			-60
			-29
			*/
		}
//		System.out.println("Abc".toUpperCase());//ABC
		String s1 = "java";
		String s2 = s1.replace('q', 'z');
		System.out.println(s1==s2);//true
		System.out.println("java".replace('q', 'o'));//java
		
	}

	private static void stringMethodDemo_1() {
		// int[] arr = {1,3,5,89,0};
		String s = "abcdae";
		String s1 = "";
		System.out.println("length:" + s1.length());//length:0
		System.out.println("length:" + s.length());// length:6
		System.out.println("char:" + s.charAt(2));// char:c
		System.out.println("index:" + s.indexOf('c'));// index:2
		System.out.println("index:" + s.indexOf('k'));// index:-1，我们可以根据-1来判断
		// 该字符或者字符串是否存在,-1表示不存在
		System.out.println("lastindex:" + s.lastIndexOf('a'));// lastindex:0
		// int index = Arrays.binarySearch(arr, 6) ;
		// sSystem.out.println("index:" + index);//-4
		
		System.out.println("substring:"+s.substring(2,4));//substring:cd
		System.out.println("substring:"+s.substring(2,s.length()));//substring:cdae
	}

}
