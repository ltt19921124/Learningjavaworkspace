package ���ģʽ;

class Single3{//����ؽ���û�ж���ֻ�е�����getInstance�������Żᴴ������
	private static Single3 s3 = null;
	private Single3(){
		
	}
	public static Single getInstance1(){
		if(s3 == null)
			s3 = new Single3();
		return s3;
	}
}

public class SingleDemo_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
