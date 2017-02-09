package 集合框架;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		show(list);
		
		
	}
	public static void show(List list){
		//添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		//插入元素
//		System.out.println(list);
//		
//		list.add(1,"abc9");//[abc1, abc2, abc3, abc4]
//		System.out.println(list);//[abc1, abc9, abc2, abc3, abc4]
		//删除元素
//		System.out.println("remove:" + list.remove(2));//remove:abc3
//		System.out.println(list);//[abc1, abc2, abc4]
		//修改元素
//		System.out.println("set:" + list.set(1,"abc8"));//set:abc2
//		System.out.println(list);//[abc1, abc8, abc3, abc4]
		//获取元素
//		System.out.println("get:" + list.get(3));//get:abc4
//		System.out.println(list);//[abc1, abc2, abc3, abc4]
		
		//获取子列表
		System.out.println("sublist:" + list.subList(1,2)) ;//sublist:[abc2]
		System.out.println(list);//[abc1, abc2, abc3, abc4]
		
		
	}
	
	
}
