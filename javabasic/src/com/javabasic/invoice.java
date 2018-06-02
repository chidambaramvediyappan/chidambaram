package com.javabasic;

public class invoice {
	String partNumber;
	String partdescription;
	int  quatity;
	double price;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartdescription() {
		return partdescription;
	}
	public void setPartdescription(String partdescription) {
		this.partdescription = partdescription;
	}
	public void  setquantity (int quatity)
	{
		if(quatity<0)
		{
			this quatity=0;
		}
		elase
		{
			this quatity=quatity;
		}
	}
	public int getQuatity() {
		
		return quatity;
	}
	public void setprice(int price)
	{
		if(price<0.0)
		{
			this price=0.0;
		}
		else
		{
		this 
		}
		}
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
