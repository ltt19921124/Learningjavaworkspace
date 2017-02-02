package 设计模式;

class Single3{//类加载进来没有对象，只有调用了getInstance方法，才会创建对象。
	private static Single3 s3 = null;
	private Single3(){
		
	}
	public static Single getInstance1(){
		if(s3 == null)
			s3 = new Single3();
		return s3;
	}
}

public class SingleDemo_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
