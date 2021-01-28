package com.设计模式.bridge桥接模式;
//构造器

public class UpRightPhone extends Phone {
	
		//������
		public UpRightPhone(Brand brand) {
			super(brand);
		}
		
		public void open() {
			super.open();
			System.out.println(" ֱ����ʽ�ֻ� ");
		}
		
		public void close() {
			super.close();
			System.out.println(" ֱ����ʽ�ֻ� ");
		}
		
		public void call() {
			super.call();
			System.out.println(" ֱ����ʽ�ֻ� ");
		}
}
