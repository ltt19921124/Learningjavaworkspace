package ����;

/*
 * 		jdk1.5���ֵ�������
 * 		��ȫ�����ԣ�Ϊ����߰�ȫ�ԡ�
 * 
 * 		�ô���
 * 			1��������ʱ�ڵ�����ת���˱���ʱ��
 * 			2��������ǿ��ת�����鷳
 * 			3��
 * 
 * */
import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();//����
		
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
