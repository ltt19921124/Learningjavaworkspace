package l;

public class XXXPrinter implements Printer{

	/**
	 * @param args
	 */
	public void open(){
		System.out.println("xxx open");
	}
	
	public void close(){
		System.out.println("xxx close");
	}
	
	public void print(String s){
		System.out.println("print-->" + s);
	}

}
