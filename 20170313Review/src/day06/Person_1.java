package day06;

public class Person_1 {

	/**
	 * @param args
	 */
	private String name;
	private int age;
	Person_1(){
		name = "baby";
		age = 1;
		System.out.println("Person1 run");
	}

	Person_1(String n){
		name = n;
	}
	
	public void setName(String n){
		name = n;
	}
	
	Person_1(String n,int a){
		name = n;
		age = a;
	}
	public void speak(){
		System.out.println(name + ":" + age);
	}
}




