package array;

public class ArrayDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 34, 67, 19, 80, 70 };

		selectSort(arr);
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length-1) {
				System.out.print(arr[i] + ",");
			} else {
				System.out.println(arr[i] + "]");
			}
		}

	}

	public static void selectSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = x + 1; y < arr.length; y++) {
				if (arr[x] > arr[y]) {
					int temp = arr[x];
					arr[x] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
}
