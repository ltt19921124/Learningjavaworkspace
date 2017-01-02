package ljkj;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Iteraror <-- Coolection <-- Set <-- HashSet
		//							List
		//hasnext() <-- next() HashSet
		Set<String> set = new HashSet<String>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("c");
		//迭代器
		//调用Set对象的Iterator方法，会生成一个迭代器对象，该对象
		//用于遍历整个Set
		Iterator<String> it = (Iterator) set.iterator();
		boolean b1 = it.hasNext();
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
