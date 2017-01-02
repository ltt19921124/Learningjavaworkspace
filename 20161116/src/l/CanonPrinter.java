package l;

public class CanonPrinter implements Printer{

	/**
	 * @param args
	 */
	private void clean(){
		System.out.println("clean");
	}
	
	
	public void close(){
		System.out.println("Canon close");
	}
	
	public void open(){
		System.out.println("Canon open");
	}
	
	public void print(String s){
		System.out.println("Canon-->" + s);
	}

}
