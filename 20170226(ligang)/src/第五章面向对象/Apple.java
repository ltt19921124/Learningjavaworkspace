package �������������;

public class Apple {

	/**
	 * @param args
	 */
	public String name;
	public String color;
	public double weight;
	//�޲εĹ�����
	public Apple(){
		
	}
	//���������Ĺ�����
	public Apple(String name,String color){
		this.name = name;
		this.color = color;
	}
	//�����������Ĺ��캯��
	public Apple(String name,String color,double weight){
		this(name,color);
		this.weight = weight;
	}
}
