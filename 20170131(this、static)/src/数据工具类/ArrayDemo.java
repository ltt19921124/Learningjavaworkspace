package 数据工具类;

public class ArrayDemo {

	/**
	 * @param args
	 * 
	 * ArrayTool ay = new ArrayTool();
	 * 
	 */
	public static void main(String[] args) {
		int []arr = {4,8,2,9,7,8,};
		
		ArrayTool tool = new ArrayTool();
		
		/*
		 * int max = tool.getMax(arr);
		 * 
		 * int index = tool.getIndex(arr,10);
		 * */
		
		int maxIndex = 0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[maxIndex])
				maxIndex = x;
		}
		System.out.println("max=" + arr[maxIndex]);
	}

}
