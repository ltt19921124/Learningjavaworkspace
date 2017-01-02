
public class TestConstructor {

	/**
	 * @param args
	 */
	public String name;
	public int count;
	
	public TestConstructor(String name,int count){
		this.name = name;
		this.count = count;
	}
	public static void main(String[] args){
		TestConstructor tc = new TestConstructor("s",20000);
		System.out.println(tc.name);
		System.out.println(tc.count);
	}

}
