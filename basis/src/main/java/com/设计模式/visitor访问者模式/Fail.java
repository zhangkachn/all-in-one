package com.设计模式.visitor访问者模式;

public class Fail extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" 男人给的评价该歌手失败 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" 女人给的评价该歌手失败 !");
	}

}
