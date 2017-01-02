
public class Person {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		String name;
		int age;
		String address;
		
		Person(){
			System.out.println("无参数的构造函数");
		}
		
		Person(String name,int age){
			this();
			this.name = name;
			this.age = age;
			System.out.println("两个");
		}
		
		Person(String name,int age,String address){
			this(name,age);
			this.address = address;
			System.out.println("三个");
		}
		
		void talk(){
			System.out.println("my name is" + name);
		}
	
}
