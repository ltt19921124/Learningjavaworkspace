package l;

interface Printer {

	/**
	 * @param args
	 */
	//���ܴ�ӡ���ͻ��մ�ӡ�����̳���һ���࣬��ô��ӡ�����Ͷ�һ�����ⲻ���ϳ���
	//���ʱ����ӡ������ඨ��ɽӿڸ��ö������ࡣ
	//��Ҫ�д�ӡ�������Լ���д
	public void open();
	
	public void close();
	
	public void print(String s);
}
