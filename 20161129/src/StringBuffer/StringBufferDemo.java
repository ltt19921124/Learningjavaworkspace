package StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * StringBuffer:�����ַ���������
		 * ���ڴ洢���ݵ�����
		 * 
		 * �ص㣺
		 * 1�����ȿɱ��
		 * 2�����Դ洢��ͬ���͵�����
		 * 3,����Ҫת���ַ�������ʹ��
		 * 4,���Զ��ַ��������޸�
		 * 
		 * �������·�����
		 * 		1�����
		 * 		StringBuffer append(data);
		 * 
		 * 		2��ɾ��
		 * 		StringBuffer delete(start,end);����ͷ��������β
		 * 		StringBuffer deleteCharAt(int index);ɾ��λ�õ�Ԫ��
		 * 		
		 * 		3,����
		 * 		char charAt(index)
		 * 		int indexOf(String)
		 * 		int lastIndexOf(String)
		 * 		
		 * 		4,�޸�
		 * 		StringBuffer replace(start,end)
		 * 		void setCharAt(index,char)
		 * 
		 * 		��ɾ�Ĳ�
		 * 		
		 * 		
		 * 		
		 */
//		bufferMethodDemo();
//		bufferMethodDemo1();
		bufferMethodDemo2();
	}
	private static void bufferMethodDemo2() {
		StringBuffer sb = new StringBuffer("abce");
		
//		sb.delete(1,3);
//		sb.delete(0,sb.length());//��ջ�����
//		sb.replace(1, 3, "nba");
//		sb.setCharAt(1, 'q');
//		System.out.println(sb);
//		sb.setLength(10);//��ӿ��ַ�
		
//		System.out.println("sb:" + sb);
//		System.out.println("len:" + sb.length());
		
		System.out.println(sb.reverse());//��ת�ַ���
	}
	private static void bufferMethodDemo1() {
		StringBuffer sb = new StringBuffer("abcd");
//		sb.append("xixi");
		sb.insert(2, "qq");//abqqcd
		System.out.println(sb.toString());
	}
	public static void bufferMethodDemo(){
		//��������������
		StringBuffer sb = new StringBuffer();
		
		sb.append(4).append(false);//.append("haha");
		sb.insert(1, "haha");
//		sb.append(true);//4true
		System.out.println(sb);
//		System.out.println(s1);
		
	}

}
