package com.设计模式.decorator装饰者模式;

public class Soy extends Decorator{


	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" 豆浆  ");
		setPrice(1.5f);
	}

}
