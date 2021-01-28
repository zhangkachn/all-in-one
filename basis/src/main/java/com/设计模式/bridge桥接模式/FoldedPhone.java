package com.设计模式.bridge桥接模式;


//折叠式手机类，继承 抽象类 Phone

public class FoldedPhone extends Phone {

	//构造器
	public FoldedPhone(Brand brand) {
		super(brand);
	}
	
	public void open() {
		super.open();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
	
	public void close() {
		super.close();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
	
	public void call() {
		super.call();
		System.out.println(" �۵���ʽ�ֻ� ");
	}
}
