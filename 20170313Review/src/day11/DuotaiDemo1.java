package day11;

class Wine{
	public void fun1(){
		System.out.println("wine��fun");
		fun2();
	}
	public void fun2(){
		System.out.println("wine��fun2");
	}
}

class JNC extends Wine{
	public void fun1(String a){
		System.out.println("JNC��fun1");
		fun2();
	}
	public void fun2(){
		System.out.println("JNC��Fun2");
	}
}

class DuotaiDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Wine a = new JNC();
		a.fun1();
	}

}



