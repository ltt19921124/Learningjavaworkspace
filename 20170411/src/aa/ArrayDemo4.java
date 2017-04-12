package aa;

public class ArrayDemo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {18,17,4,5,6,23,12,708};
//		int max = getMax_2(arr);
//		System.out.println("max=" + max);
		print(arr);
		bubbleSort(arr);
		print(arr);
	}
	//交换功能
	public static void swap(int[]arr,int a,int b){
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//获取最大值
	public static int getMax(int[] arr){
		int max = arr[0];
		for(int x=0;x<arr.length;x++){
			if(arr[x] > max){
				max = arr[x];
			}
		}
		return max;
	}
	
	public static int getMax_2(int[] arr){
		int maxIndex = 0;
		for(int x=1;x<arr.length;x++){
			if(arr[x] > arr[maxIndex]){
				maxIndex = x;
			}
		}
		return arr[maxIndex];
	}
	public static void bubbleSort(int[] arr){
		for(int x=0;x < arr.length - 1;x++){
			for(int y=0;y < arr.length - 1 - x;y++){
				if(arr[y] > arr[y+1]){
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	public static void print(int[] arr){
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			} else {
				System.out.println(arr[i] + "]");
			}
		}
	}
}






