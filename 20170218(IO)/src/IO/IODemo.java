package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");
	/**
	 * @param args
	 */
	public static void main(String[] args)throws IOException {
		/*
		 * �����������
		 * ���룺�����ݴ��豸�ƶ����ڴ�
		 * ��������ڴ��е������ƶ����洢�豸
		 * 
		 * �ֽ����������㸸��
		 * 1,InputStream
		 * 2,OutputStream
		 * 
		 * �ַ����������㸸��
		 * 1,Reader 2,Writer
		 * ���඼�Ը�������Ϊ��׺
		 * ������������ǰ׺���Ǹö���Ĺ���
		 * 
		 * ���Ҫ�����������ݣ�Ҫ���ȿ����ַ���
		 * */
		
		/*
		 * ����һ���������ļ���д���ַ����ݵ��ַ����������
		 * Ҫ�ڴ�������ʱ����ȷ���ļ���Ŀ�ĵ�
		 * ����ļ����ڣ�����Զ�����
		 * ��������ڣ���ᱻ����
		 * ������캯������true���ͻ���д
		 * */
		FileWriter fw = new FileWriter("demo.txt");
		
		
		//write()����д������
//		fw.write("abcde" + LINE_SEPARATOR +"nhaha");
//		fw.close();
		/*
		 * ����ˢ�£�Ȼ������������д�뵽Ŀ�ĵ�
		 * */
//		fw.flush();
		fw.write("ah");
		fw.write("hujkk");
		
		fw.close();
		
		
		
	}
}







