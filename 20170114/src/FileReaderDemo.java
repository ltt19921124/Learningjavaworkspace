import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		/*1������һ���ܶ�ȡ�ַ����Ķ���
		 * 	������ȡ������ʱ������Ҫ��ȷ����ȡ���ļ���һ��Ҫȷ��
		 * ���ļ��Ǵ��ڵ�
		 * ��һ����ȡ������һ���Ѿ����ڵ��ļ�
		 */
		
		FileReader fr = new FileReader("demo.txt");
		
		
		//��Reader�е�read������ȡ�ַ���
		int ch = fr.read();
		System.out.println((char)ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		
		
		fr.close();
	}

}




