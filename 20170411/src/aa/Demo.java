package aa;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		print99();
	}
	public static void print99(){
		for(int x=1;x<=9;x++){
			for(int y=1;y <= x;y++ ){
				System.out.print(y+ "*" + x + "=" + x*y +"\t");
			}
			System.out.println("");
		}
	}

}
