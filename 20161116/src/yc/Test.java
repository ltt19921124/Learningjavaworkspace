package yc;

public class Test {

	/**
	 * @param args
	 */
	//�쳣�Ƕ�����jdk�ṩ
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		//uncheck exception
		try{
			//���ļ��Ĵ���
			System.out.println(2);
			int i = 1 / 0;
			System.out.println(3);
		}
		catch(Exception e){
			e.printStackTrace();//��ӡ�쳣��Ϣ
			System.out.println(4);
		}
		finally{
			System.out.println("finally");//Ҳ���쳣����
			//�ر��ļ��Ĵ���
			//������һ����һЩ������
		}
		System.out.println(5);
	}

}
