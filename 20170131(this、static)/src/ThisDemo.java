
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
		this(name);//this语句只能在第一行。
		//this也能用于在构造函数中调用其他的构造函数，但是this语句只能
		//定义在构造函数的第一行？因为初始化动作要先执行。
		age = age;
	}
	public void speak(){
		System.out.println(this.name+":" + this.age);
	}
	/*
	 * 判断是否是同龄人
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
