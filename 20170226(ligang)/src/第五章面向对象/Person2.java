package 第五章面向对象;

public class Person2 {

	private String name;
	
	private int age;
	
	public void setName(String name){
		//要求输入的用户名必须在2~6位之间
		if(name.length()>6 || name.length() < 2){
			System.out.println("您输入的人名不符合要求");
			return;
		}else{
			this.name = name;
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	//提供方法来操作age属性
	public void setAge(int age){
		//执行合理性校验，要求年龄在0~100岁之间
		if(age > 100 || age < 0){
			System.out.println("您设置的年龄不符合要求");
			return;
		}else{
			this.age = age;
		}
	}
	
	//获取年龄值
	public int getAge(){
		return this.age;
	}
}

/*
 * 分析：在Person类中，该类的name和age属性只能在类中
 * 才可以访问，所以提供setter和getter方法来操作和访问它们
 * 
 * 
 * */






