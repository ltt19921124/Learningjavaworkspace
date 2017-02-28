package 第四章流程控制和数组;

public class TestReturn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			System.out.println("i的值是" + i);
			if(i == 1){
				//return语句会结束该循环
				return;
			}
			System.out.println("continue后的输出语句");
		}
	}

}
