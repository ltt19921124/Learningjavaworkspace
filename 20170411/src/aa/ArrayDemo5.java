package aa;

import java.util.Arrays;

public class ArrayDemo5 {

	/**
	 * @param args
	 * 数组常见功能：查找
	 */
	public static void main(String[] args) {
		int[]arr = {1,2,34,56,798};
//		System.out.println(getIndex(arr,3));//-1
//		System.out.println(getIndex(arr,7));//4
		System.out.println(halfSearch_2(arr,57));
		System.out.println(Arrays.binarySearch(arr,57));
	}
	//查找
	public static int getIndex(int[] arr,int key){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key){
				return i;
			}
		}
		return -1;
	}
	//二分查找(折半查找)
	public static int halfSearch(int[] arr,int key){
		int max,min,mid;
		max = arr.length - 1;
		min = 0;
		mid = (min + max)/2;
		while(arr[mid] != key){
			if(key > arr[mid])
				min = mid + 1;
			else if(key < arr[mid]){
				max = mid - 1;
			}
			if(max < min){
				return -1;
			}
			mid = (min+max)/2;
		}
		return mid;
	}
	//
	public static int halfSearch_2(int[] arr,int key){
		int max,min,mid;
		min=0;
		max = arr.length-1;
//		mid=(min+max)
		while(min<=max){
			mid = (max+min)>>1;
			
			if(key>arr[mid]){
				min = mid+1;
			}
			else if(key<arr[mid]){
				max = mid-1;
			}
			else{
				return mid;
			}
		}
		return -min-1;
	}
}
