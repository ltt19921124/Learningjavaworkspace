package Vector;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList link = new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
//		System.out.println(link);//[abc4, abc3, abc2, abc1]s
//		System.out.println(link);//[abc4, abc3, abc2, abc1]
//		System.out.println(link.getFirst());//abc4
//		System.out.println(link.getFirst());//abc4
		
//		System.out.println(link.removeFirst());//abc4
//		System.out.println(link.removeFirst());//abc3
//		System.out.println(link);//[abc2, abc1]
//		Iterator it = link.iterator();
//		while(it.hasNext()){
//			System.out.println(it.next());//4在最上面
//		}
		
		while(!(link.isEmpty())){
			System.out.println(link.removeFirst());//还有removeLast
		}
		
		System.out.println(link);
	}

}




