package ljkj;

import java.util.List;
import java.util.ArrayList;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�༯��ܣ�1����һ����ͽӿ�
		//2��λ��java.util����
		//3����Ҫ���ڴ洢�͹������
		//4����Ҫ��Ϊ�����ࣺ���� �б� ӳ��
		//Iterator Collection
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		arrayList.add("d");
		arrayList.add("d");
		
		arrayList.remove(2);
		int a = arrayList.size();
//		String s = arrayList.get(2);
//		System.out.println(s);
		
		for (int i = 0; i < arrayList.size(); i++) {
			String s = arrayList.get(i);
			System.out.println(s);
		}
	}

}
