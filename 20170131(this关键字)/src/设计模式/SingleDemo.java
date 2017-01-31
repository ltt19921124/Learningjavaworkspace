package 设计模式;



class Single{
	private static Single s = new Single();
	private Single(){
		
	}
	
	public static Single getInstance(){
		return s;//返回一个本类对象
	}
}

public class SingleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);
//		Single ss = Single.s;
	}

}




