package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUIDemo {

	/**
	 * ͼ���û�����
	 * AWT����Swing����
	 * 
	 * AWT(���󴰿ڹ��߰�):�������ؼ���Ҫ���ñ��ط���
	 * 
	 * Swing:��AWT�Ļ����ϣ�������һ��ͼ�ν���ϵͳ���������ؼ�����ȫ
	 * ��javaʵ�֣���ǿ����ֲ�ԣ������������ؼ�
	 * component
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame();
//		f.setSize(500,400);
//		f.setLocation(400,200);
		f.setBounds(400,200,500,400);
		f.setLayout(new FlowLayout());//��ʽ����
//		
		Button but = new Button("��ť");
		
		f.add(but);
		
		
			
			
		f.setVisible(true);
		System.out.println("over");
		
	}
}






