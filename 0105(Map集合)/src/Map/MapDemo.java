package Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();//学号
		method(map);// map有泛型。

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
