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
		books.add("������J2EE��ҵӦ��ʵս");
		books.add("Struts2Ȩ��ָ��");
		books.add("����J2EE��Ajax����");
		Iterator it = books.iterator();
		while(it.hasNext()){
			String book = (String)it.next();
			System.out.println(book);
			if(book.equals("Struts2Ȩ��ָ��")){
				it.remove();
			}
			book = "�����ַ���";
		}
		System.out.println(books);
	}

}
