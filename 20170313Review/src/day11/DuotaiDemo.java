package day11;


class ����ү
{
	void ����()
	{
		System.out.println("����");
	}
	void ����()
	{
		System.out.println("����");
	}
}

class ����ʦ extends ����ү
{
	void ����()
	{
		System.out.println("Java");
	}
	void ����Ӱ()
	{
		System.out.println("����Ӱ");
	}
	public void callFu(){
		super.����();
	}
}

class  DuotaiDemo
{
	public static void main(String[] args) 
	{
//		����ʦ x = new ����ʦ();
//		x.����();
//		x.����Ӱ();

//		super.����();
		����ү x = new ����ʦ();
		x.����();
		x.����();

		����ʦ y = (����ʦ)x;//ClassCastException
//		y.callFu();
		y.����Ӱ();

	}
}


