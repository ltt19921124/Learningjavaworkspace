
/*
 * 描述人：
 * 
 * 
 * 
 * */
package 面向对象;

class Person{
	int age;
	void speak(){
		System.out.println("age=" + age);
	}
}

public class PersonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
		p.age = -20;//这样会出问题。
		p.speak();
	}

}
