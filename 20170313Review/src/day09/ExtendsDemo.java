package day09;

class Fu{
	
}

class Zi extends Fu{
	void show(){
		System.out.println("this");
	}
}

class ExtendsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Zi z = new Zi();
//		System.out.println("z=" + z);
		z.show();
	}

}
