package awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class TestPanel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Frame f = new Frame("���Դ���");
		Panel p = new Panel();
		p.add(new TextField(20));
		p.add(new Button("������"));
		f.add(p);
		f.setBounds(30,30,250,120);
		f.setVisible(true);
	}

}
