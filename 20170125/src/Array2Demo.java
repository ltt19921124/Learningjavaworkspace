public class Array2Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 一维数组：int []arr = new int[3]; 二维数组
		 */
		int[][] arr1 = new int[3][2];// 创建一个二维数组，该数组中有3个一维数组，每个
		// 一维数组有两个元素。
		System.out.println(arr1);// 直接打印二维数组，[[I@15db9742，@符号左边是实体
		// 类型，右边是实体哈希值，两个中括号表示二维数组，一个表示一维数组
		// System.out.println(arr[0]);//直接打印二维数组中的角标0的一维数组

		/*
		 * 二维数组，另一种定义方式
		 */
		int sum = 0;
		int[][] arr = { { 3, 1, 7 }, { 5, 8, 2 }, { 4, 1 } };// 遍历
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[x].length; y++) {
//				System.out.println(arr[x][y] + ",");
				sum += arr[x][y];
			}
		}
		System.out.println("sum=" + sum);//求和
		
		//二维数组使用场景
		//甲：30 59 28 17
		//乙：37 60 22 19
		int [][]arr2 = {{30,59,28,17},{37,60,22,19}};
		
		
		
	}

}
