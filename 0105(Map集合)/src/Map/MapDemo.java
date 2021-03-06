package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();//学号
//		method(map);// map有泛型。
		method_2(map);
	}
	
	public static void method_2(Map<Integer,String> map){
		map.put(2,"zhaoliu");
		map.put(7, "xiaoqiang");
		map.put(6, "wangcai");
		
		//取出map中所有元素
		//原理，通过keyset方法获取map中的所有的set集合，再通过Set的迭代器
		//获取每一个键获取其对应的值即可。
		
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
	}

	public static void method(Map<Integer, String> map) {

		// 1，添加元素
		System.out.println(map.put(8, "wangcai"));// null
		System.out.println(map.put(8, "xiaoqiang"));// wangcai
		map.put(2, "zhangsan");
		map.put(7, "zhaoliu");

		// 删除

		System.out.println("remove:" + map.remove(2));

		// 判断
		System.out.println("containskey:" + map.containsKey(7));

		// 获取
		System.out.println("get:" + map.get(8));
		System.out.println(map);

	}

}
