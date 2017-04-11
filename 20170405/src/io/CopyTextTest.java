package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest {

	/**
	 * @param args
	 * 需求：
	 * 1，需要读取源
	 * 2，将读到的源数据写入目的地
	 * 3，既然是操作文本数据用字符流
	 * 
	 */
	public static void main(String[] args)throws IOException {
		//1,读取已有的文本文件，使用字符读取流和文件相关联
		FileReader fr = new FileReader("IO流_2.txt");
		//2,创建一个目的地，用于存储读取数据
		FileWriter fw = new FileWriter("copytext_1.txt");
		//3,频繁的读取操作
		int ch = 0;
		while((ch=fr.read())!= -1){
			fw.write(ch);
		}
		//4,关闭流
		fw.close();
		fr.close();
	}

}
