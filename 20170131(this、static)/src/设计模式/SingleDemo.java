package 设计模式;


//饿汉式
class Single{//类一加载，对象就在了
	private static Single s = new Single();
	private Single(){
		
	}
	
	public static Single getInstance(){
		return s;//返回一个本类对象
	}

	
}
//懒汉式
class Single2{//类加载进来没有对象，只有调用了getInstance方法，才会创建对象。
	private static Single2 s4 = null;
	private Single2(){
		
	}
	public static Single getInstance1(){
		if(s4 == null)
			s4 = new Single2();
		return s4;
	}
}

public class SingleDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Single ss = Single.s;   
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();
		System.out.println(s1==s2);//true，说明s1和s2是同一个对象
		//对象唯一性
//		Single ss = Single.s;
	}

}







