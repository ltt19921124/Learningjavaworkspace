package day06;


class Person{
	private int age;
	
	public void setAge(int a){
		age = a;
	}
	public int getAge(){
		return age;
	}
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
		p.getAge();
		p.speak();
	}

}
