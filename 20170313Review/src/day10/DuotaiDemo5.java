package day10;

class bi{
	void jiangke(){
		System.out.println("管理");
	}
	void diaoyu(){
		System.out.println("钓鱼");
	}
}

class bilaoshi extends bi{
	void jiangke(){
		System.out.println("java");
	}
	void kandianying(){
		System.out.println("看电影");
	}
}

class DuotaiDemo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		bilaoshi x = new bilaoshi();
		x.jiangke();
		x.kandianying();
		
		
	}

}
