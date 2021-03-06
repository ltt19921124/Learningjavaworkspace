package day08;

class ArrayTools {
	
	private ArrayTools(){}
	
	//获取数组最大值
	public static int getMax(int[] arr){
		int maxIndex = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[maxIndex]){
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}
	//对数组排序
	public static void selectSort(int[] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}
	//交换
	private static void swap(int[] arr,int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	//获取指定元素索引
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0; x<arr.length; x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	
	//将int型数组转成字符串
	public static String arrayToString(int[] arr)
	{
		String str = "[";

		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
				str = str + arr[x]+", ";
			else
				str = str + arr[x]+"]";
		}
		return str;
	}
}




