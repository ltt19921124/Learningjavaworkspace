package This;

public class Person {

	/**
	 * @param args
	 */
	String name;
	int age;
	String address;
	
	Person(){
		
	}
	
	Person(String name){
		this.name = name;
	}
	
	Person(String name,int age){
		this(name);
		this.age = age;
	}
	Person(String name,int age,String address){
		this(name,age);
		this.address = address;
	}
	
	void talk(String name){
		System.out.println("mu name is" + name);
	}

}
