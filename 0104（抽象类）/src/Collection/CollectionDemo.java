package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		show(coll);
	}
	public static void show(Collection coll){
		//添加元素
		coll.add("abc");
		coll.add("abc2");
		coll.add("abc3");
		
		//删除元素
//		coll.remove("abc2");//会改变集合长度
		//清空集合
//		coll.clear();
//		System.out.println(coll.contains("abc3"));//true
		System.out.println(coll);
	}
	
}
