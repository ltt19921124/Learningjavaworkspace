package StringBuilder;

public class StringBuilderTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * ��int����ת���ַ���
		 * 
		 * */
		int[] arr = {3,1,5,3,8};
//		String s = arrayToString(arr);
//		System.out.println(s);//[3,1,5,3,8]
		String s = arrayToString_2(arr);
		System.out.println(s);//[3,1,5,3,8]
	}
	
	public static String arrayToString_2(int[] arr){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1){
				sb.append(arr[i] + ",");
			}else
				sb.append(arr[i] + "]");
		}
		//������ֻ��һ���ַ������ڴ�����С
		return sb.toString();
	}
	
	public static String arrayToString(int[] arr){
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if(i != arr.length - 1){
				str += arr[i] + ",";
			}else
				str += arr[i] + "]";
		}
		
		
		return str;
	}
}