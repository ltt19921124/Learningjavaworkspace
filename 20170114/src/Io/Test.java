package Io;

import java.io.FileInputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//声明输入流引用
		FileInputStream fis = null;
		try{
			//生成代表输入流的对象
			fis = new FileInputStream("E:/workspace/20170114/from.txt");
			//生成一个字节数组
			byte [] buffer = new byte[100];
			//调用输入流对象的方法，读取数据
			fis.read(buffer,0,buffer.length);
			
			for(int i=0;i<buffer.length;i++){
				System.out.println(buffer[i]);
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
