

class Person{
	String name;//成员变量，实例变量
	static String country = "CN";//静态变量，类变量
	public void show(){
		System.out.println(Person.country+":" + name);
	}
}

public class StaticDemo {
	int num = 4;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Person p  = new Person(); 
//		p.name = "小强";
//		p.show();//CN:小强
//		System.out.println(p.country);//CN
//		System.out.println(Person.country);//CN
		new Person().show();
		
	}
	public void show(){
		System.out.println(num);
	}

}



