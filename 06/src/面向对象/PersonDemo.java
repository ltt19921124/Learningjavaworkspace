
/*
 * 描述人：
 * 1，年龄
 * 2，说话
 * 
 * 
 * */
package 面向对象;

class Person{
	private /*私有*/int age;//只在本类中有效，外界不能访问
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
//		p.age = -20;//这样会出问题。年龄不会有负数。这里就不符合常识。有安全隐患
		p.speak();
	}

}
