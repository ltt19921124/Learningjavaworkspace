package Static;

public class Test {

	/**
	 * @param args
	 * ��̬�������ȿ������������ã�Ҳ������
	 * �������
	 * 
	 */
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		
		Person.i = 10;
		
		System.out.println("p1��iֵΪ��"+ p1.i);
		System.out.println("p2��iֵΪ��" + p2.i);
	}

}
