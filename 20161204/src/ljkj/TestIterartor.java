package ljkj;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterartor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Collection books  = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		books.add("基于J2EE的Ajax宝典");
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("Struts2权威指南")){
				it.remove();
			}
			book = "测试字符串";
		}
		System.out.println(books);
	}

}
