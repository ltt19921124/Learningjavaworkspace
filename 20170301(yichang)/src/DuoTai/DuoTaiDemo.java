package DuoTai;

/*
if(a instanceof Cat ){
	Cat c = (Cat)a;
	c.catchMouse();
}
通常在向下转型前用于健壮性判断
*/

class 毕姥爷{
	void 讲课(){
		System.out.println("管理");
	}
	void 钓鱼(){
		System.out.println("钓鱼");
	}
}

class 毕老师  extends 毕姥爷{
	void 讲课(){
		System.out.println("java");
	}
	void 看电影(){
		System.out.println("看电影");
	}
}

class DuoTaiDemo {

	public static void main(String[] args) {
//		毕老师  x = new 毕老师();
//		x.看电影();//看电影
//		x.讲课();//java
		//多态情况下
		//转型过程中，自始自终都是子类对象在做类型的转换。
		毕姥爷 x = new 毕老师();
		x.讲课();//java
		x.钓鱼();//钓鱼，继承
		
		毕老师 y = (毕老师)x;
		y.看电影();//看电影
		
	}
}




