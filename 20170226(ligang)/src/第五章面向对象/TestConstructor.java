package �������������;

public class TestConstructor {

	public String name;
	
	public int count;
	//��������������������
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




