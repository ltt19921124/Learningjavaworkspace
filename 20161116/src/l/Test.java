package l;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����û���ѡ��������Ӧ�Ĵ�ӡ������
		//��������ת��ΪPrinter����
		//
//		Printer printer = null;
		int flag = 2;
		Printer printer = PrinterFactory.getPrinter(flag);
		printer.open();
		printer.print("test");
		printer.close();
	}

}
