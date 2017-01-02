package l;

public class HPPrinter implements Printer{

	/**
	 * @param args
	 */
	public void open(){
		System.out.println("HP open");
	}
	
	public void close(){
		System.out.println("HP close");
	}
	
	public void print(String s){
		System.out.println("HP Print-->" + s);
	}

}
