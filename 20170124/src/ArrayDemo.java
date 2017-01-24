
import java.util.*;

public class ArrayDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * */
		// 位置置换
		int[] arr = { 4, 7, 8, 9, 45, 89 };
		int index = halfSearch(arr, 50);
		System.out.println("index=" + index);
		
		int index1 = Arrays.binarySearch(arr, 50);//折半查找,-min-1,返回，
		//如果存在返回元素的位置，如果不存在，返回应该插入点位置的负数再减一
		System.out.println("index1=" + index1);
		// 数组常见功能：查找
	}

	public static int getMax(int[] arr, int key) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == key) {
				return x;
			}
		}
		return -1;
	}

	/*
	 * 二分查找
	 */
	public static int halfSearch(int[] arr, int key) {
		int max, mid, min;
		min = 0;
		max = arr.length - 1;
		mid = (max + min) / 2;

		while (max >= min) {
			if (key > arr[mid]) {
				min = mid + 1;
			} else if (key < arr[mid]) {
				max = mid - 1;
			}
			else
				return mid;
			mid = (max + min) >> 1;
		}
		return min;
	}
	/*
	 * 有一个有序的数组，若往该数组中存储一个数，并保证这个数组 还是有序的，那么这个元素的下标应该是多少？ 思路：折半查找。
	 */

}
