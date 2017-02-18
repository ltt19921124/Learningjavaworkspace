package 泛型;

/*
 * 		jdk1.5出现的新特性
 * 		安全新特性，为了提高安全性。
 * 
 * 		好处：
 * 			1，将运行时期的问题转到了编译时期
 * 			2，避免了强制转换的麻烦
 * 			3，
 * 
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();//泛型
		
		al.add("haha");//public boolean add(Object obj)
		al.add("hahaha");
//		al.add(4);//al.add(new Integer(4))
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()){
			String str = it.next();
			System.out.println(str);
		}
	}

}
