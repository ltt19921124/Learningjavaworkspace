package 第五章面向对象;

public class TestConstructor {

	public String name;
	
	public int count;
	//构造器，包含两个参数
	public TestConstructor(String name,int count){
		
		this.name = name;
		this.count = count;
	}
	
	public static void main(String[] args){
		TestConstructor tc = new TestConstructor("java", 100);
		System.out.println(tc.name);//java
		System.out.println(tc.count);//100
		
		
		
	}
}




