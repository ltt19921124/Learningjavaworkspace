package String;

public class StringDemo {

	/**
	 * @param args
	 */
	/*
	 * String���ص㣺
	 * �ַ��������ʼ����Ͳ���ı䡣
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDemo2();
	}
	private static void StringDemo2() {
		// TODO Auto-generated method stub
		String s = "abc";//�ڳ������У��ɹ���
		String s1 = new String("abc");//������������
		System.out.println(s==s1);
		
		System.out.println(s.equals(s1));//String���е�equals��д��Object
		//���е�equals����ʵ���ǱȽ�����
	}
	/* 
	 *��ʾ�����ַ�������ĵ�һ�ַ�ʽ������ȷ
	 *�����أ�����û�н������У�ֱ����
	 * 
	 */
	private static void StringDemo1() {
		String s = "abc";
//		s = "nba";
		String s1 = "abc";
		System.out.println(s==s1);//true
		System.out.println("s=" + s);//��ӡ��s=nba
	}

}
