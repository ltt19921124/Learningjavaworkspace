package 第四章流程控制和数组;

public class TestBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			System.out.println("i的值是" + i);
			if(i == 2){
				//用break跳出循环
				break;
			}
		}
	}

}
