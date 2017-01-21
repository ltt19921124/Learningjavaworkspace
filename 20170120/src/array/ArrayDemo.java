package array;

import java.util.*;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = { 45, 89, 56, 78, 90, 1, 2, 34, 578 };
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	public static void bubbleSort(int[] arr) {
		for (int x = 0; x < arr.length - 1; x++) {
			for (int y = 0; y < arr.length; y++) {
				if (arr[y] > arr[y + 1]) {
					int temp = arr[y];
					arr[y] = arr[y + 1];
					arr[y + 1] = temp;
				}
			}
		}
	}

}
