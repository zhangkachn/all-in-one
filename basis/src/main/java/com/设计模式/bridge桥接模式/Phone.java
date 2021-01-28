package com.设计模式.bridge桥接模式;
// 充当了桥的作用 连接 FoldedPhone和vivo，xiaoMI

public abstract class Phone {

	//组合品牌

	private Brand brand;

	//构造器
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
