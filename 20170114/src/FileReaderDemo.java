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
		 * -1作为流的结束标志
		 */
		
		FileReader fr = new FileReader("demo.txt");
		
		
		//用Reader中的read方法读取字符，
//		int ch = fr.read();
//		System.out.println((char)ch);
//		int ch1 = fr.read();
//		System.out.println(ch1);
//		int ch2 = fr.read();
//		System.out.println(ch3);
//		int ch = 0;
//		while((ch=fr.read()) != -1){
//			System.out.println((char)ch);
//		}
		
//		fr.close();
		/*
		 * 使用read(char())读取文本文件数据
		 * 先创建字符数组
		 */
		char[] buf = new char[3];//创建字符数组
		int num = fr.read(buf);//将读到的字符存储到数组中
		System.out.println(num + ":" +new String(buf));
		
		fr.close();
	}

}





