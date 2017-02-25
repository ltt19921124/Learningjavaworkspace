package 集合框架;

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
		method_1(map);
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
		
		while(it.hasNext()){
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + ":" + value);
		}
		
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









