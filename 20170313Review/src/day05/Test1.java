package day05;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Test t = new Test();
//		t.show();
		int[] arr = {3,4,5,78,12,45};
		shellSort(arr);
		
		
	}
	
	public static void shellSort(int[] arr){
		int d = arr.length;
		d = d / 2;
		while(true){
			for (int i = 0;i < d;i++){
				d = d/2;
				for (int x = 1;x < arr.length;x+=d){
					int temp = arr[x];
					int j = x - d;
					for (;j >=0 && temp < arr[j];j-=d){
						arr[j+d] = arr[j];
					}
					arr[j+d] = temp;
				}
			}
			if (d==1){
				break;
			}
		}
		for(int x = 0;x < arr.length;x++){
			System.out.println(arr[x]);
		}
	}
}
