package �������������;

public class TestPerson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person2 p = new Person2();
//		p.age = 20;
		p.setAge(1000);
		System.out.println("δ������age����ʱ��" + p.getAge());
		p.setAge(30);
		System.out.println("�ɹ�����age����ʱ��" + p.getAge());
		p.setName("���");
		System.out.println("�ɹ�����name����ʱ��" + p.getName());
		
		/*
		 * javac -d . hello.java
		 * */
	}

}
