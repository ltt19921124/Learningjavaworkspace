public class Array2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * һά���飺int []arr = new int[3]; ��ά����
		 */
		int[][] arr1 = new int[3][2];// ����һ����ά���飬����������3��һά���飬ÿ��
		// һά����������Ԫ�ء�
		System.out.println(arr1);// ֱ�Ӵ�ӡ��ά���飬[[I@15db9742��@���������ʵ��
		// ���ͣ��ұ���ʵ���ϣֵ�����������ű�ʾ��ά���飬һ����ʾһά����
		// System.out.println(arr[0]);//ֱ�Ӵ�ӡ��ά�����еĽǱ�0��һά����

		/*
		 * ��ά���飬��һ�ֶ��巽ʽ
		 */
		int sum = 0;
		int[][] arr = { { 3, 1, 7 }, { 5, 8, 2 }, { 4, 1 } };// ����
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
//				System.out.println(arr[x][y] + ",");
				sum += arr[x][y];
			}
		}
		System.out.println("sum=" + sum);//���
		
		//��ά����ʹ�ó���
		//�ף�30 59 28 17
		//�ң�37 60 22 19
		int [][]arr2 = {{30,59,28,17},{37,60,22,19}};
		
		
		
	}

}