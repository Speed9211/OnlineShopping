package com.account;

public class Account {
	double principleAmmount,intrest;

	
	
	public Account(double principleAmmount, double intrest) {
		super();
		this.principleAmmount = principleAmmount;
		this.intrest = intrest;
	}

	public double getPrincipleAmmount() {
		return principleAmmount;
	}

	public void setPrincipleAmmount(double principleAmmount) {
		this.principleAmmount = principleAmmount;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}
	

}
