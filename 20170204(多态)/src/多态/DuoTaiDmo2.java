package 多态;

class 毕姥爷{
	void 讲课(){
		System.out.println("管理");
	}
	void 钓鱼(){
		System.out.println("钓鱼");
	}
}

class 毕老师 extends 毕姥爷{
	void 讲课(){
		System.out.println("java");
	}
	void 看电影(){
		System.out.println("看电影");
	}
}

public class DuoTaiDmo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		毕老师  x = new 毕老师();
//		x.讲课();
//		x.看电影();
		
		毕姥爷 x = new 毕老师();
		x.讲课();
		x.钓鱼();
		
		毕老师 y = (毕老师)x;//向上转型ClassCastException
		y.看电影();
		
//		x.看电影();
	}

}
