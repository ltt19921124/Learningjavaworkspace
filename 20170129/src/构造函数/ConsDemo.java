package ���캯��;

class Person {
	private int age;
	private String name;

	// ����һ��Person��Ĺ��캯��

	Person() {// �ղ����Ĺ��캯��
		name = "baby";//��ʼ������
		age = 1;
		System.out.println("person run");
	}
	//����еĺ���һ����������
	Person(String n){
		name = n;
	}
	
	Person(String n,int a){
		name = n;
		age = a;
	}
	public void speak() {
		System.out.println(name + ":" + age);
	}
}

public class ConsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();//���д�ӡ��person run 
		//�����������ʱ���õĺ��������ã��������ʼ����
//		p.speak();
		Person p1 = new Person("����");
		p1.speak();
		Person p2 = new Person("Сǿ",10);
		p2.speak();
		String s = "abc";
		System.out.println(s);
	}
	

}
