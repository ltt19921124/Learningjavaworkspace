package List;

import java.util.ArrayList;

import java.util.List;

public class ListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
//		show(list);
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		System.out.println("sublist:"+ list.subList(1, 2));//���б�
		
		System.out.println(list);
	}
	
//	public static void show(List list ){
//		list.add("abc1");
//	}
}
