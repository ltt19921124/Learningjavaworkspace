
public class Person {

	/**
	 * @param args
	 */
	
		// TODO Auto-generated method stub
		String name;
		int age;
		String address;
		
		Person(){
			System.out.println("�޲����Ĺ��캯��");
		}
		
		Person(String name,int age){
			this();
			this.name = name;
			this.age = age;
			System.out.println("����");
		}
		
		Person(String name,int age,String address){
			this(name,age);
			this.address = address;
			System.out.println("����");
		}
		
		void talk(){
			System.out.println("my name is" + name);
		}
	
}
