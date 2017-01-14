package Io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 声明输入流引用
		FileInputStream fis = null;
		// 声明输出流的引用
		FileOutputStream fos = null;
		try {
			// 生成代表输入流的对象
			fis = new FileInputStream("E:/workspace/20170114/from.txt");
			// 生成代表输出流的对象
			fos = new FileOutputStream("E:/workspace/20170114/to.txt");
			// 生成一个字节数组
			byte[] buffer = new byte[100];
			// 调用输入流对象的方法，读取数据
			int temp = fis.read(buffer, 0, buffer.length);
//			fis.read(buffer, 5, buffer.length - 5);
			fos.write(buffer, 0, temp);
			// String s = new String(buffer);
			// 调用一个String的trim方法，将会除掉字符串的首尾空格和空字符
			// s = s.trim();//调用这个方法后打印出abcd
			// System.out.println(s);

			for (int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);// 97、98、99、100
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
