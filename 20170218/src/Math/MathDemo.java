package Math;

public class MathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 
		 * ceil()
		 * floor()
		 * round()
		 * 
		 * */
//		double d1 = Math.ceil(12.56);
//		double d2 = Math.floor(12.56);
//		double d3 = Math.round(12.56);
//		System.out.println(d1);
//		sop("d1=" + d1);
//		sop("d2=" + d2);
//		sop("d3=" + d3);
		
		for (int i = 0; i < 10; i++) {
//			double d = Math.ceil((Math.random()*10));
			double d = (int)(Math.random()*6 + 1);
			
			System.out.println(d);
		}
		
	}
	private static void sop(String string) {
		System.out.println(string);
	}
}




