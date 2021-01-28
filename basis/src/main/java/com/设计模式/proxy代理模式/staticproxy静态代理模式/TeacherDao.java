package com.设计模式.proxy代理模式.staticproxy静态代理模式;

public class TeacherDao implements ITeacherDao {

	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println(" 老师授课中  。。。。。");
	}

}
