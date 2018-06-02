package com.javabasic;

public class Savingaccount {
	static double annualInterestRate;
    double savingsBalance;

public Savingaccount(int savingsBalance)
{
	this.savingsBalance = savingsBalance;
}

public void calculateMonthlyInteresteRate()
{
  double Inertest =((savingsBalance *(annualInterestRate/100.0))/12);
  savingsBalance =savingsBalance+ Inertest;
}
  public static void modifyInterestRate(int newValue)
  {
	  annualInterestRate =newValue;
  }
  public void showBalance()
  {
	  System.out.println("balance ="+savingsBalance);
  }
  public static void main(String[] args)
  {
	 
	  Savingaccount s1 =new  Savingaccount(2000);
	  Savingaccount s2 =new   Savingaccount(4000);
	  
	  
	  
	  Savingaccount .modifyInterestRate(4);
	  s1.showBalance();
	  s2.showBalance();
	  
	  
	  s1.calculateMonthlyInteresteRate();
	  s2.calculateMonthlyInteresteRate();
	  s1. showBalance();
	  s2.showBalance();
}}