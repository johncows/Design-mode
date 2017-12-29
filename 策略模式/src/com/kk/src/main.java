package com.kk.src;

public class main {
	/*
	 * realMoney 为算法接口 
	 * Pay为工厂方法 封装算法类
	 * 半价 与 三折 都是折扣的子类
	 * 
	 */
	public static void main(String[] args) {
		Pay pay = new Pay("");
		System.out.println(pay.pst());
	}
}
