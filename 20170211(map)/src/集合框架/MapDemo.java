package 集合框架;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer, String>();
//		method(map);
		method_2(map);
	}
	
	private static void method_2(Map<Integer, String> map) {
		map.put(8, "wan");
		map.put(2, "zhaoliu");
		map.put(7, "xiao");
		map.put(6, "wancai");
		
		Collection<String> values = map.values();
		
		Iterator<String> it2 = values.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
 		
		//values方法
		
//		int value = map.size();
//		System.out.println(value);
		
		/*
		 *通过Map转成set就可以迭代
		 * 找到另一个方法，entrySet
		 * 该方法将键和值的映射关系作为对象存储到了Set集合中，而这个
		 * 映射关系的类型就是Map,Entry类型()结婚证。
		 * enTry理解：
		 * 
		 * 将键和值封装成一个对象，通过Map.Entry对象的getKey，getValue
		 * 获取其中的键和值。
		 * 
		 * */
//		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
//		Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
//		
//		while(it.hasNext()){
//			Map.Entry<Integer, String> me = it.next();
//			Integer key = me.getKey();
//			String value = me.getValue();
//			System.out.println(key + ":::" + value);
//		}
		
	}

	public static void method_1(Map<Integer, String>map){
		
		map.put(8, "wan");
		map.put(2, "zhaoliu");
		map.put(7, "xiao");
		map.put(6, "wancai");
		//取出map中的所有元素，
		//通过keyset方法获取所有的map中所有的键所在的Set集合，再通过
		//Set迭代器获取每一个键，再对每一个键取出对于的值即可。
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		/*
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		*/
		
	}
	
	
	public static void method(Map<Integer,String>map){
		//添加元素
		System.out.println(map.put(8,"wangcai"));//null
//		System.out.println(map.put(8,"xiao"));//wangcai，存相同键，值会覆盖
		map.put(2,"zhang");
		map.put(7, "zhao");
//		int i = map.size();
//		System.out.println("size:" + i);
		
		System.out.println(map);//{8=wangcai}
		
		//删除
//		System.out.println("remove:" + map.remove(2));//remove:zhang
//		System.out.println(map);//{7=zhao, 8=xiao}
		//判断
//		System.out.println("containskey:" + map.containsKey(7));//containskey:true
		
		//获取
//		System.out.println("get:" + map.get(8));//get:xiao
//		System.out.println("get:" + map.get(6));//
		
		
	}
}









