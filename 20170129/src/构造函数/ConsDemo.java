package 构造函数;

class Person {
	private int age;
	private String name;

	// 定义一个Person类的构造函数

	Person() {// 空参数的构造函数
		name = "baby";//初始化动作
		age = 1;
		System.out.println("person run");
	}
	//如果有的孩子一出生有名字
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
		Person p = new Person();//运行打印出person run 
		//构建创造对象时调用的函数，作用：给对象初始化。
//		p.speak();
		Person p1 = new Person("旺财");
		p1.speak();
		Person p2 = new Person("小强",10);
		p2.speak();
		String s = "abc";
		System.out.println(s);
	}
	

}
