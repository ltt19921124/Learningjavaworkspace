package �̳�;

	class Phone{
	
		void show(){
			System.out.println("number");
		
		}
	}
	class NewPhone extends Phone{
		
		void show(){
			System.out.println("name");
			System.out.println("pic");
			System.out.println("number");
		}
	}

	public class ExtendsDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		NewPhone p = new NewPhone();
		p.show();
	}
}
