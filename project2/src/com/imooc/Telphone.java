package com.imooc;

public class Telphone {
	private float screen;
	private float cpu;
	private float mem;
	
	
	public float getScreen(){
		return screen;
	}
	public void setScreen(float newScreen){
		this.screen=newScreen;
	}
	public Telphone(){
		System.out.println("com.imooc.Telphone�޲εĹ��췽��ִ���ˣ�");
	}
    public Telphone(float newScreen,float newCpu,float newMem){
    	
    	screen=newScreen;
    	mem=newCpu;
    	mem=newMem;
    	System.out.println("�вεĹ��췽��ִ���ˣ�");
    }

}
