package �߳�;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;

public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 6, 4, 78, 34, 56,89,77,45 };
		insertSort(arr);
		int d = (int) Math.ceil(7.1);// 8
		// System.out.println(d);
	}

	public static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			for (; j >= 0 && temp < arr[j]; j--) {
				arr[j + 1] = arr[j];
				// arr[j+1] = temp;
			}
			arr[j + 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
