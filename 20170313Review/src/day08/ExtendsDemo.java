package day08;

class Person {

	String name;
	int age;
}

class Student extends Person{
	
	String name;
	int age;
	
	void study(){
		System.out.println(name + "...study..." + age);
	}
}
class Worker extends Person
{
//	String name;
//	int age;
	void work()
	{
		System.out.println("worker work");
	}
}

class ExtendsDemo 
{
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.name= "zhangsan";
		s.age = 22;
		s.study();
	}
}




