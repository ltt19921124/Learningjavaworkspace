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
		 * 输入输出流：
		 * 输入：把数据从设备移动到内存
		 * 输出：将内存中的数据移动到存储设备
		 * 
		 * 字节流两个顶层父类
		 * 1,InputStream
		 * 2,OutputStream
		 * 
		 * 字符流两个顶层父类
		 * 1,Reader 2,Writer
		 * 子类都以父类名作为后缀
		 * 而且子类名的前缀就是该对象的功能
		 * 
		 * 如果要操作文字数据，要优先考虑字符流
		 * */
		
		/*
		 * 创建一个可以往文件中写入字符数据的字符输出流对象
		 * 要在创建对象时，明确该文件的目的地
		 * 如果文件存在，则会自动创建
		 * 如果不存在，则会被覆盖
		 * 如果构造函数加入true，就会续写
		 * */
		FileWriter fw = new FileWriter("demo.txt");
		
		
		//write()方法写入数据
//		fw.write("abcde" + LINE_SEPARATOR +"nhaha");
//		fw.close();
		/*
		 * 进行刷新，然后立即把数据写入到目的地
		 * */
//		fw.flush();
		fw.write("ah");
		fw.write("hujkk");
		
		fw.close();
		
		
		
	}
}








