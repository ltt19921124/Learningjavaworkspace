package string类;
/* 1,给定一个字符串数组，按照字典顺序从小到大排序
 * 		给定一个字符串数组，按照字典顺序从小到大排序
 * 2,一个子串在整串出现的次数
 * 		"abcghynbacbabauhuinbaabc"
 * 		思路：	1，获取要找的子串是否存在，若存在，获取位置，用indexOf
 * 				2，若找到了，记录出现的位置并在剩余的字符串中查找，而剩余字符串
 * 					起始	位是出现位置+子串的查到
 * 				3，以此类推，通过循环查找，如果找不到就返回-1，并每次找到用
 * 					计数器计数
 * 3,两个字符串中最大相同子串
 * 		
 * 		思路
 * 			1,既然取得时最大子串，先看短的那个字符串是否在长的那个字符串中
 * 			2，如果存在，短的那个字符串就是最大子串，若不存在，就把短的字符串
 * 				长度递减的方式去子串，判断是否存在，若存在就可以了
 * 4,去除字符串两端空白
 * 		模拟一个trim方法，去除字符串两端空白
 * 		思路：
 * 			1，定义两个角标，一个作为从头开始判断字符串空格的角标，++
 * 			2，一个作为从尾开始判断字符串空格的角标,--
 * 			3，判断到不是空格位置，取头尾之间的字符串即可.
 * 
 * */
public class StringTest {

	/**
	 * @param args
	 * 给定一个字符串数组，按照字典顺序从小到大排序
	 * 
	 */
	/*
	 * 排序
	 * 1，对数组排序，可以用选择、冒泡
	 * 2，for循环比较以及换位
	 * 3，问题：以前排的是整数，现在是 字符串对象
	 * 		字符串对象怎么比较呢？对象中提供了字符串比较
	 * 		的功能
	 * */
	public static void main(String[] args) {
//		String str = "abcghynbacbanbabauhuinbaabcnbanba";
//		String key = "nba";
//		String s1 = "qwerthbnhjmfchuj";
//		String s2 = "qwerthbnhjmfhb";
//		
//		String s = getMaxSubString(s1,s2);
//		System.out.println("s=" + s);
//		int count = getKeyStringCount(str,key);
//		int count = getKeyStringCount_2(str,key);
//		
////		System.out.println("count:" + count);
//		String[] arr = {"nba","abc","cba","zz","qq"};
//		
//		printArray(arr);//[nba,abc,cba,zz,qq]
//		
//		sortString(arr);
//		
//		printArray(arr);//[abc,cba,nba,qq,zz]
//		String s = "    ab   c   ";
//		
//		s = myTrim(s);
//		
//		System.out.println("-" + s + "-");//-ab   c-
		String s = "abccab";
		System.out.println(s.indexOf("ab", 0));
	}
	private static String myTrim(String s) {
		
		int start = 0;
		int end = s.length() - 1;
		
		while(start <= end && s.charAt(start) == ' '){
			start++;
		}
		while(start <= end && s.charAt(end) == ' '){
			end--;
		}
		
		return s.substring(start,end + 1);
	}
	/**
	 * 获取最大子串
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static String getMaxSubString(String s1, String s2) {
		
		String max = null;
		String min = null;
		max = (s1.length()>s2.length()?s1:s2);
		
		min = max.equals(s1)?s2:s1;
		System.out.println("max=" + max);
		System.out.println("min=" + min);
		
		for (int i = 0; i < min.length(); i++) {
			for(int a=0,b=min.length() - i;b != min.length()+1;a++,b++){
				String sub = min.substring(a,b);
//				System.out.println(sub);
				if(max.contains(sub))
					return sub;
			}
		}
		
		return null;
	}
	private static int getKeyStringCount_2(String str, String key) {
		/*
		 * 排序
		 * 1，对数组排序，可以用选择、冒泡
		 * 2，for循环比较以及换位
		 * 3，问题：以前排的是整数，现在是 字符串对象
		 * 		字符串对象怎么比较呢？对象中提供了字符串比较
		 * 		的功能
		 * */
		int count = 0;
		int index = 0;
		
		while((index = str.indexOf(key,index)) != -1){
			index = index + key.length();
			count ++;
		}
		
		return count;
	}
	/**
	 * 文档注释
	 * 获取子串在整串中出现的次数
	 * @param str
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String str, String key) {
		/*
		 * 排序
		 * 1，对数组排序，可以用选择、冒泡
		 * 2，for循环比较以及换位
		 * 3，问题：以前排的是整数，现在是 字符串对象
		 * 		字符串对象怎么比较呢？对象中提供了字符串比较
		 * 		的功能
		 * */
		//1,定义计数器
		int count = 0;
		
		//2,定义变量，记录key出现的位置
		int index = 0;
		
			while((index = str.indexOf(key)) != -1){
				str = str.substring(index + key.length());
				count ++;
			}
			
		return count;
	}

	private static void sortString(String[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].compareTo(arr[j])>0){//字符串比较用compareto方法完成
					swap(arr,i,j);
				}
			}
		}
	}
	
	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static void printArray(String[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else
				System.out.println(arr[i]+"]");
		}
	}
}
