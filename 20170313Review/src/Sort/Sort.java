package Sort;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {3,7,89,90,123,56};
//		insertSort(arr);
//		insertSort_2(arr);
//		insertSort_3(arr);
//		insertSort_4(arr);
//		short s = 5;
//		byte b = 5;
//		System.out.println(b);
//		byte b = 4;
//		b = (byte) (b + 7);
//		System.out.println(b);
	}

	private static void insertSort_4(int[] arr) {
		//简单选择排序
		for (int i = 0; i < arr.length; i++) {
			int position = i;
			int temp = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < temp){
					temp = arr[j];
					position = j;
				}
			}
			arr[position] = arr[i];
			arr[i] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void insertSort_3(int[] arr) {
		//冒泡排序
		for (int i = 0;i < arr.length - 1;i++){
			for (int j = 0;j < arr.length - 1 - i;j++){
				if (arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void insertSort_2(int[] arr) {
		//希尔排序
		int d = arr.length;
		while(true){
			d = d/2;
			for (int x = 0;x < d;x++){
				for (int y = x + d;y < arr.length;y+=d){
					int temp = arr[y];
					int j = y - d;
					for (; j >= 0 && temp < arr[j]; j-=d) {
						arr[j+d] = arr[j];
					}
					arr[j+d] = temp;
				}
			}
			
			if (d == 1){
				break;
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void insertSort(int[] arr) {
		/*
		 * 直接插入排序，默认前面的n-1个数是排好序了的把
		 * 第n个数插入有序数列中。
		 * */
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	
		
}
