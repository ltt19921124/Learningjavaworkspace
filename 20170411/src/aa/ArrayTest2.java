package aa;

/*
 * 获取正数的十六进制表现形式
 * 
 * */
public class ArrayTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		toHex(60);
		
	}
	public static void toHex(int num){
		for(int x=0;x<8;x++){
			int temp = num&15;
			System.out.println(temp);
			num=num>>>4;
		}
		/*
		int n1 = num&15;
		System.out.println("n1="+n1);
		
		num= num>>>4;
		int n2 = num&15;
		System.out.println("n2=" + n2);
		*/
	}
}
