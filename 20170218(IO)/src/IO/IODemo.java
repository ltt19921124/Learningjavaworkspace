package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IODemo {

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
		 * 
		 * */
		FileWriter fw = new FileWriter("demo.txt");
		
		
		
	}
}








