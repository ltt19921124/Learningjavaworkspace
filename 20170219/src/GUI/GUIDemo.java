package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GUIDemo {

	/**
	 * 图形用户界面
	 * AWT包和Swing包中
	 * 
	 * AWT(抽象窗口工具包):重量级控件，要调用本地方法
	 * 
	 * Swing:在AWT的基础上，建立了一套图形界面系统，轻量级控件，完全
	 * 由java实现，增强了移植性，属于轻量级控件
	 * component
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame();
//		f.setSize(500,400);
//		f.setLocation(400,200);
		f.setBounds(400,200,500,400);
		f.setLayout(new FlowLayout());//流式布局
//		
		Button but = new Button("按钮");
		
		f.add(but);
		
		
			
			
		f.setVisible(true);
		System.out.println("over");
		
	}
}







