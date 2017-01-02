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
		System.out.println("com.imooc.Telphone无参的构造方法执行了！");
	}
    public Telphone(float newScreen,float newCpu,float newMem){
    	
    	screen=newScreen;
    	mem=newCpu;
    	mem=newMem;
    	System.out.println("有参的构造方法执行了！");
    }

}
