/*
 * ������
 * ������ͳ��ģ��
 * ����������������
 * */

package ������;

abstract class Demo{
	abstract/*����*/ void show();
}

class DemoA extends Demo{
	void show(){
		System.out.println("demoa");
	}
}

class DemoB extends Demo{
	void show(){
		System.out.println("demob");
	}
}

public class AbstractDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
