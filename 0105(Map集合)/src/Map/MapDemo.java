package Map;

import java.util.HashMap;
import java.util.Map;



public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		method(map);
	}
	public static void method(Map<Integer,String>map){
		System.out.println(map.put(8,"wangcai"));
		
	}
	
}
