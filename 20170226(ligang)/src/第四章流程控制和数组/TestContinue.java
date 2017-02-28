package 第四章流程控制和数组;

public class TestContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		for(int i=0;i<3;i++){
//			System.out.println("i的值为" + i);
//			if(i == 1){
//				continue;
//			}
//			System.out.println("continue后输出语句");
//		}
		outer:
			for(int i=0;i<6;i++){
				for(int j=0;j<3;j++){
					System.out.println("i的值为" +i+"j的值为"+j);
					if(j==1){
						continue outer;
					}
				}
			}
	}

}
