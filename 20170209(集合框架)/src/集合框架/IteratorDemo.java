package 集合框架;
/*
 * Collection
 * 	 1,List:有序，元素有索引(元素可重复)
 * 
 * 	 2,Set:元素不可重复，
 * 
 * 	 3,
 * 
 * List特有常见方法：有一个共性特点，就是都可以操作角标
 * 		1，添加
 * 			void add(index,element)
 * 
 * 
 * 		2，删除
 * 
 * 
 * 		3，
 * 
 * 
 * 
 * 
 * 
 * */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection coll = new ArrayList();//
		
		coll.add("abc1");
		coll.add("abc2");
		coll.add("abc3");
		coll.add("abc4");
//		System.out.println(coll);//[abc1, abc2, abc3, abc4]
		
		//使用了Collection中的iterator()方法,调用集合中的迭代器方法是为了huode
		//iterator对象，迭代器
//		Iterator it = coll.iterator();
//		
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		
		for(Iterator it = coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		
		
//		System.out.println(it.next());//abc1
//		System.out.println(it.next());//abc2
		//用循环取出集合中的元素
		
	}

}
