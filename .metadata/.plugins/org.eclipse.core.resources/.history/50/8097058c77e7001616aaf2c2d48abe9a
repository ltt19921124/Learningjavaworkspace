
class Person{
	private String name;
	private int age;
	Person(){
		name = "baby";
		age = 1;
		System.out.println("person run");
	}
	Person(String name){
		this.name = name;
	}
	
	Person(String name,int age){
		this(name);//this语句只能在第一行。
		//this也能用于在构造函数中调用其他的构造函数，但是this语句只能
		//定义在构造函数的第一行？因为初始化动作要先执行。
		age = age;
	}
	public void speak(){
		System.out.println(this.name+":" + this.age);
	}
}

public class ThisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p = new Person();
	}

}
