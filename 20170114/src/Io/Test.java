package Io;

import java.io.FileInputStream;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������������
		FileInputStream fis = null;
		
		try {
			// ���ɴ����������Ķ���
			fis = new FileInputStream("E:/workspace/20170114/from.txt");
			// ����һ���ֽ�����
			byte[] buffer = new byte[100];
			// ��������������ķ�������ȡ����
			fis.read(buffer, 5, buffer.length - 5);
			String s = new String(buffer);
			//����һ��String��trim��������������ַ�������β�ո�Ϳ��ַ�
			s = s.trim();//��������������ӡ��abcd
			System.out.println(s);

			// for (int i = 0; i < buffer.length; i++) {
			// System.out.println(buffer[i]);// 97��98��99��100
			// }

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}