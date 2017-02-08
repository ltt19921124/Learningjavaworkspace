package StringBuffer;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer�����ַ���������
		 * ���ڴ洢���ݵ�����(����������(�̶�����))
		 * 		�ص㣺
		 * 			1�������ǿɱ��
		 * 			2�����Դ洢��ͬ���͵�����
		 * 			3������Ҫת���ַ�������ʹ��
		 * 			4,���Զ��ַ��������޸�
		 * 
		 * 		��Ȼ��һ��������Ӧ�þ߱���Щ���ܣ�
		 * 			1������,(byte ��short�������ݲ��ܴ洢)
		 * 				StringBuffer append(data) Ĭ�ϴ�С16���ַ�
		 * 				StringBuffer insert(index,data);
		 * 			2��ɾ��	
		 * 				StringBuffer delete(start,end);����ͷ��������β	
		 * 				StringBuffer deleteCharAt(int index);//ɾ��ָ��λ��Ԫ��
		 * 			3,���ң�
		 * 				char charAt(index)
		 * 				int indexOf(String)
		 * 				int lastIndexOf(String) 
		 * 
		 * 			4,�޸�
		 * 				StringBuffer replace(start,end,string);
		 * 
		 * 			��ɾ�Ĳ�:C(create)U(update)R(read)D(delete)
		 * 			
		 * 			
		 * 
		 * */
//		bufferMethodDemo();
//		bufferMethodDemo_1();
		bufferMethodDemo_2();
	}

	private static void bufferMethodDemo_2() {
		StringBuffer sb = new StringBuffer("abce");
//		sb.delete(1, 3);
//		System.out.println(sb);//ae������β
		
		//��ջ�����
//		sb.delete(0, sb.length());
		
//		sb = new StringBuffer();
		
//		System.out.println(sb);//��ջ�����
//		sb.replace(1, 2, "nba");
//		System.out.println(sb);//anbace
//		sb.replace(1, 2, "nba");
//		System.out.println(sb);//anbabace
//		sb.setCharAt(2, 'q');
//		System.out.println(sb);//abqe
//		sb.setLength(2);
//		System.out.println("sb:" + sb);//sb:ab
//		System.out.println("len:" + sb.length());//len:2
//		sb.setLength(10);
//		System.out.println("sb:" + sb);//sb:abce(���ַ�)
//		System.out.println("len:" + sb.length());//len:10
		System.out.println(sb.reverse());//ecba
	}

	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abcd");
		
		sb.append("xixi");
		System.out.println(sb.toString());//abcdxixi
		sb.insert(2, "qq");//�����ַ���
		System.out.println(sb.toString());//abqqcdxixi
	}

	private static void bufferMethodDemo() {
		//��������������
		StringBuffer sb = new StringBuffer();
		
//		StringBuffer s1 = sb.append(4);
//		System.out.println(sb == s1);//true
//		System.out.println(s1);//4
		sb.append(4).append(false);//����������(β������)
//		System.out.println(sb);//4
//		System.out.println(sb.toString());//4
//		sb.append(true);
		System.out.println(sb);//4true
		sb.insert(1, "haha");
		System.out.println(sb);//4hahafalse
		
		
	}

}



