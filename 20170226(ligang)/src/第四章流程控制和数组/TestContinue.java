package ���������̿��ƺ�����;

public class TestContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(int i=0;i<3;i++){
//			System.out.println("i��ֵΪ" + i);
//			if(i == 1){
//				continue;
//			}
//			System.out.println("continue��������");
//		}
		outer:
			for(int i=0;i<6;i++){
				for(int j=0;j<3;j++){
					System.out.println("i��ֵΪ" +i+"j��ֵΪ"+j);
					if(j==1){
						continue outer;
					}
				}
			}
	}

}
