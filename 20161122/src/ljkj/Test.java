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
		//������
		//����Set�����Iterator������������һ�����������󣬸ö���
		//���ڱ�������Set
		Iterator<String> it = (Iterator) set.iterator();
		boolean b1 = it.hasNext();
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

}
