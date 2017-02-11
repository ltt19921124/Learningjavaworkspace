package Set;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Set:元素不可重复，无序
 * 		Set接口中的方法和Collection一致
 * 		1，HashSet:内部数据结构是哈希表，不同步
 * 			哈希表：其实里面还是数组，哈希算法对数组进行了
 * 
 * 		2，TreeSet:
 * 
 * 
 * 
 * */

public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("haha");
		hs.add("xixi");
//		hs.add("haha");
//		hs.add("haha");//不重复
		hs.add("hehe");
		hs.add("heihei");
		
		Iterator it = hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
	}

}






