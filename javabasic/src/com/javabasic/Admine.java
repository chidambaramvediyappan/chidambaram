package com.javabasic;

public class Admine {
	public static void main(String[] args)
	{
		date d1 = new  date();
		d1.setDay(31);
		d1.setMonth(5);
		d1.setYear(2018);
		d1.displayDate();	
		date d2 =new date(5,6,2018);
		d2.displayDate();
		}
}
