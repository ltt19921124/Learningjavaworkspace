package l;

public class PrinterFactory {

	/**
	 * @param args
	 */
	/**
	 * 
	 * 
	 * 
	 */
	public static Printer getPrinter(int flag) {
		Printer printer = null;
		if (flag == 0) {
			printer = new HPPrinter();
		} else if (flag == 1) {
			printer = new CanonPrinter();
		} else if (flag == 2) {
			printer = new XXXPrinter();
		}
		return printer;
	}

}
