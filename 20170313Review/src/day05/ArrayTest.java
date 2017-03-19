package day05;

public class ArrayTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6,7};
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}
	
	//打印数组功能
	private static void printArray(int[] arr) {
		System.out.print("[");
		for (int x = 0;x < arr.length;x++){
			if (x != arr.length - 1){
				System.out.print(arr[x] + ",");
			}else{
				System.out.print(arr[x] + "]");
			}
		}
		System.out.println();
	}
	
	//数组进行反转

		private static void reverseArray(int[] arr) {
			/*
			for (int i = arr.length - 1;i >= 0;i--){
				System.out.print(arr[i]);
			}
			*/
			for (int start = 0,end = arr.length - 1;start < end;start++,end--){
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
}





