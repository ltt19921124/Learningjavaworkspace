package day05;

public class ArrayDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {78,67,34,56,90};
//		printArray(arr);
//		selectSort(arr);
//		bubbleSort(arr);
//		selectSort_2(arr);
//		printArray(arr);
//		int x = getMax_2(arr);
//		System.out.println(x);
	}
	/*
	private static int getMax_2(int[] arr) {
		int maxIndex = 0;
		for (int x = 1;x < arr.length;x++){
			if (arr[x] > arr[maxIndex]){
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}
	*/
	/*
	 ��ȡ��ֵ
	private static int getMax(int[] arr) {
		int max = arr[0];
		for(int x = 0;x < arr.length;x++){
			if (arr[x] > max){
				max = arr[x];
			}
		}
		return max;
	}
	*/
	//ѡ������2
	/*
	private static void selectSort_2(int[] arr) {
		for(int x = 0;x < arr.length;x++){
			int temp = arr[x];
			int position = x;
			for (int y=x + 1;y< arr.length;y++){
				if (arr[y] < temp){
					temp = arr[y];
					position = y;
				}
			}
			arr[position] = arr[x];
			arr[x] = temp;
		}
	}
	*/
	//ð������
	private static void bubbleSort(int[] arr) {
		for (int x = 0;x < arr.length - 1;x++){
			for (int y = 0;y < arr.length - 1 - x;y++){
				if (arr[y] > arr[y+1]){
					int temp = arr[y+1];
					arr[y+1] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	//ѡ������
	private static void selectSort(int[] arr) {
		for (int x = 0;x < arr.length;x++){
			for (int y = x + 1;y < arr.length;y++){
				if (arr[x] > arr[y]){
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	
	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1){
				System.out.print(arr[i] + ",");
			}else{
				System.out.println(arr[i] + "]");
			}
		}
	}
	
	

}