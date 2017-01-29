package 构造函数;

class Person {
	private int age;
	private String name;

	// 定义一个Person类的构造函数

	Person() {// 空参数的构造函数
		System.out.println("person run");
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
		Person p = new Person();//运行打印出person run 
	}

}
