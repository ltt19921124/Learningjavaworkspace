package ���������̿��ƺ�����;

public class TestReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println("i��ֵ��" + i);
			if(i == 1){
				//return���������ѭ��
				return;
			}
			System.out.println("continue���������");
		}
	}

}
