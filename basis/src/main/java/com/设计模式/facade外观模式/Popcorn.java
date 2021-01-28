package com.设计模式.facade外观模式;
// 爆米花
public class Popcorn {
	
	private static Popcorn instance = new Popcorn();
	
	public static Popcorn getInstance() {
		return instance;
	}
	
	public void on() {
		System.out.println(" popcorn on ");
	}
	
	public void off() {
		System.out.println(" popcorn ff ");
	}
	
	public void pop() {
		System.out.println(" popcorn is poping  ");
	}
}
