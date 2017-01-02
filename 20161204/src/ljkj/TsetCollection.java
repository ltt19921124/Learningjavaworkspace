package ljkj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TsetCollection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合的元素个数为：" + c.size());
		c.remove(6);
		System.out.println("c集合的元素个数为：" + c.size());
		System.out.println("c集合是否包含孙悟空字符串：" + c.contains("孙悟空"));
		c.add("轻量级J2EE企业应用实战");
		System.out.println("c集合的元素:" + c);
		
		Collection<Object> books = new HashSet<Object>();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		System.out.println("c集合是否完全包含books集合？" + c.containsAll(books));
		c.removeAll(books);
		System.out.println("c集合的元素：" + c);
		c.clear();
		System.out.println("c集合的元素：" + c);
		books.retainAll(c);
		System.out.println("books集合的元素：" + books);
	}

}
