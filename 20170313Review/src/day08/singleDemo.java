package day08;

//饿汉式
class Single{
	
	private static Single s = new Single();
	
	private Single(){
		
	}
	public static Single getInstance(){
		return s;
	}
}

class Single_1{
	private static Single_1 s = null;
	
	private Single_1(){
		
	}
	public static Single_1 getInstance(){
		if(s == null)
			s = new Single_1();
		return s;
	}
}

public class singleDemo {

	/**
	 * @param args
	 * 单例设计模式
	 * 
	 */
	public static void main(String[] args) {
		
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1 == s2);
		
		
	}

}







