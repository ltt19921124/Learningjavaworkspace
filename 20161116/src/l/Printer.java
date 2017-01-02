package l;

interface Printer {

	/**
	 * @param args
	 */
	//佳能打印机和惠普打印机都继承自一个类，那么打印方法就都一样（这不符合常理）
	//这个时候打打印机这个类定义成接口更好而不是类。
	//都要有打印方法，自己复写
	public void open();
	
	public void close();
	
	public void print(String s);
}
