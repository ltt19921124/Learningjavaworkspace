import java.io.FileReader;
import java.io.IOException;


public class FileReaderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		/*1，创建一个能读取字符流的对象
		 * 	创建读取流对象时，必须要明确被读取的文件，一定要确认
		 * 该文件是存在的
		 * 用一个读取流关联一个已经存在的文件
		 */
		
		FileReader fr = new FileReader("demo.txt");
		
		
		//用Reader中的read方法读取字符，
		int ch = fr.read();
		System.out.println((char)ch);
		int ch1 = fr.read();
		System.out.println(ch1);
		
		
		fr.close();
	}

}





