package ���Ͽ��;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		method(map);
	}
	
	public static void method(Map<Integer,String>map){
		//����Ԫ��
		System.out.println(map.put(8,"wangcai"));
		
	}
}
