package com.account;

public class CalculateIntrest {
	
	public static double calculetIntrest(Account a,int noOfYear)
	{
		double intrestPercentage=0.0f,finalIntrest;
		intrestPercentage=(a.intrest)/noOfYear;
		//System.out.println("Intrest="+intrestPercentage);
		finalIntrest=(a.principleAmmount * intrestPercentage * noOfYear)/100;
		
		return finalIntrest;
		
	}
	public static void main(String[] args) {
		Account account=new Account(5000.45f, 4.0f);
		System.out.println(CalculateIntrest.calculetIntrest(account, 5));
	}

}
