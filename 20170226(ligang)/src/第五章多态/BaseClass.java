package 第五章多态;

public class BaseClass {

	/**
	 * p166
	 * @param args
	 */
	public int book = 6;
	public void base(){
		System.out.println("父类普通方法");
	}
	
	public void test(){
		System.out.println("父类被覆盖的方法");
	}

	
}
class SubClass extends BaseClass{
	public String book = "轻量级";
	public void test(){
		System.out.println("覆盖父类方法");
	}
	
	public void sub(){
		System.out.println("子类普通方法");
	}
	
	public static void main(String[] args){
		BaseClass bc = new BaseClass();
		System.out.println(bc.book);
		
		bc.base();
		bc.test();
		SubClass sc = new SubClass();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		BaseClass bas = new BaseClass();
		System.out.println(bas.book);
		bas.base();
		bas.test();
	
	}
}



