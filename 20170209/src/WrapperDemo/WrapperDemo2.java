package WrapperDemo;

public class WrapperDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num = 4;
		
		num = num + 5;
		
		Integer i = 4;// i = new Integer(4) �Զ�װ��	
		i =  i + 6;//i = i + 6;
		
		Integer a = new Integer(127);//JDK1.5�Ժ����װ�����һ���ֽڣ�
		//��ô�����ݻṲ���������¿��ٿռ�
		
		Integer b = new Integer(127);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		Integer x = 129;
		Integer y = 129;
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
	}

}