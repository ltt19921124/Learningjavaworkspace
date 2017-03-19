package day05;

public class ArrayDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {4,18,73,89,98};
//		int index = halfSearch_2(arr,90);
//		System.out.println(index);//-5:-min-1
//		int index1 = halfSearch(arr,90);
//		System.out.println(index1);//-5
//		int index = getIndex(arr,98);
//		System.out.println(index);//4
		int index = getIndex(arr, 19);
		System.out.println(index);//-1返回-1说明没有这个数
	}
	
	
	//查找
	private static int getIndex(int[] arr, int key) {
		for (int x = 0;x < arr.length;x++){
			if (key == arr[x]){
				return x;
			}
		}
		return -1;
	}



	private static int halfSearch(int[] arr, int key) {
		int max,min,mid;
		min = 0;
		max = arr.length - 1;
		mid = (min + max)/2;
		while(arr[mid] != key){
			if (key > arr[mid]){
				min = mid + 1;
			}else if(key < arr[mid]){
				max = mid = 1;
			}
			if(min>max){
				return -min-1;
			}
			mid = (max + min)/2;
		}
		return mid;
		
	}



	private static int halfSearch_2(int[] arr, int key) {
		int max,min,mid;
		min = 0;
		max = arr.length - 1;
		while(min <= max){
			mid = (min + max) >> 1;
			if(key > arr[mid]){
				min = mid + 1;
			}else if(key < arr[mid]){
				max = mid - 1;
			}else
				return mid;
		}
		return -min - 1;
	}

	

}
