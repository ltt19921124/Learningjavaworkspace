package day10;

class bi{
	void jiangke(){
		System.out.println("����");
	}
	void diaoyu(){
		System.out.println("����");
	}
}

class bilaoshi extends bi{
	void jiangke(){
		System.out.println("java");
	}
	void kandianying(){
		System.out.println("����Ӱ");
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