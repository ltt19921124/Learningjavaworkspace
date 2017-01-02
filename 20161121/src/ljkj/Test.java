package ljkj;

import java.util.List;
import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//类集框架：1，是一组类和接口
		//2，位于java.util包中
		//3，主要用于存储和管理对象
		//4，主要分为三大类：集合 列表 映射
		//Iterator Collection
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("d");
		
		arrayList.remove(2);
		int a = arrayList.size();
//		String s = arrayList.get(2);
//		System.out.println(s);
		
		for (int i = 0; i < arrayList.size(); i++) {
			String s = arrayList.get(i);
			System.out.println(s);
		}
	}

}
