
class Person_1{
	private String name;
	private int age;
	Person_1(){
		name = "baby";
		age = 1;
		System.out.println("person run");
	}
	Person_1(String name){
		this.name = name;
	}
	
	Person_1(String name,int age){
		this(name);//this���ֻ���ڵ�һ�С�
		//thisҲ�������ڹ��캯���е��������Ĺ��캯��������this���ֻ��
		//�����ڹ��캯���ĵ�һ�У���Ϊ��ʼ������Ҫ��ִ�С�
		age = age;
	}
	public void speak(){
		System.out.println(this.name+":" + this.age);
	}
	/*
	 * �ж��Ƿ���ͬ����
	 * 
	 * */
	public boolean compare(Person_1 p){
		return this.age == p.age;
	}
	
	
}

public class ThisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person_1 p1 = new Person_1("aa",20);
		Person_1 p2 = new Person_1("zz",12);
		
		
	}

}
