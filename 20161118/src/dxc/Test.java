package dxc;

class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft = new FirstThread();
		// 启动线程
		ft.start();
		// 不能调用run方法
		for (int i = 0; i < 100; i++) {
			System.out.println("main" + i);
		}
	}

}
