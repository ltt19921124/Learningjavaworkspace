package yc;

class User {

	/**
	 * @param args
	 */
	private int age;
	public void setAge(int age) throws Exception{
		if(age < 0){
			//RuntimeException
			Exception r = new Exception("年龄不能为负数");
//			throw r;
		}
		this.age = age;
	}

}
