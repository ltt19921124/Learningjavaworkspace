package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextTest_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		try{
			fr = new FileReader("IO流_2.txt");
			fw = new FileWriter("copytest_2.txt");
			//创建一个临时容器，用于缓存读取到的字符
			char[] buf = new char[1024];
			//定义变量，记录读取到的字符数(其实就是往数组里装的字符个数)
			int len = 0;
			while((len=fr.read(buf))!= -1){
				fw.write(buf,0,len);
			}
			
		}catch(Exception e){
			
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(fr!=null){
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}

}
