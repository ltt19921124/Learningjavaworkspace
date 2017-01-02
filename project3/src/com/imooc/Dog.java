package com.imooc;

public class Dog extends Animal {
	public int age=20;
	public void eat(){
		System.out.println("�����гԹ�ͷ������");
	}
	public Dog(){
		
		System.out.println("Dog��ִ����");
	}
	public void method(){
		
		eat();
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		return true;
	}
	public String toString() {
		return "Dog [age=" + age + "]";
	}
}
