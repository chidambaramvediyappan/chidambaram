package com.javabasic;

public class isEven {
	int i;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public boolean Even()
	{
		
		if(1%2==0)
		{
			return true;
			}
else
	{
		return false;
	}
	}
	public static void main(String[] args)
	{
	isEven e1 = new isEven();
	e1.setI(45);
	System.out.println(e1.setI());
	}

	}

