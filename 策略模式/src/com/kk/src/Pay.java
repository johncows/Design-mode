package com.kk.src;

public class Pay {
	realMoney real = null;
	
	public Pay(String cost) {
		if(cost.equals("half")) {
			real = new halfPay();
		}else {
			real = new thirdMoney();
		}
	}
	
	public double pst(){
		return real.realPay();
	}
	
}
