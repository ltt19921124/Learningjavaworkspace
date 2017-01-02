package l;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//根据用户的选择，生成相应的打印机对象
		//并且向上转型为Printer类型
		//
//		Printer printer = null;
		int flag = 2;
		Printer printer = PrinterFactory.getPrinter(flag);
		printer.open();
		printer.print("test");
		printer.close();
	}

}
