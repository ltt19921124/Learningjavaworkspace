package �����¼̳�;

public class SubClass extends BaseClass {

	/**
	 * @param args
	 */
	
	public int a = 7;
	public void accessOwner(){
		System.out.println(a);
	}
	
	public void accessBase(){
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		SubClass sc = new SubClass();
		sc.accessOwner();//7
		sc.accessBase();//5
	}

}
