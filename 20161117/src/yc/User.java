package yc;

class User {

	/**
	 * @param args
	 */
	private int age;
	public void setAge(int age) throws Exception{
		if(age < 0){
			//RuntimeException
			Exception r = new Exception("���䲻��Ϊ����");
//			throw r;
		}
		this.age = age;
	}

}
