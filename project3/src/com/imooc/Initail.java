package com.imooc;

public class Initail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Animal animal=new Animal();
		System.out.println("animal age:"+animal.age);
		*/
		Dog dog=new Dog();
		dog.age=15;
		Dog dog2=new Dog();
		dog2.age=15;
		if(dog.equals(dog2)){
			System.out.println("������������ͬ��");
		}else{
			System.out.println("���������ǲ�ͬ��");
		}
   }

}
