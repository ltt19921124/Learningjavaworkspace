package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
//		show(list);
	}

	private static void show(List list) {
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()){
			System.out.println("next:" + it.next());
		}
//		for(int x = 0;x < list.size();x ++){
//			System.out.println("get:" + list.get(x));
//		}
	}

}
