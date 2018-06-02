package com.javabasic;

public class Happy
{
        int one;
		int two;
		
		
		public int getOne() {
			return one;
		}


		public void setOne(int one) {
			this.one = one;
		}


		public int getTwo() {
			return two;
		}


		public void setTwo(int two) {
			this.two = two;
		}


		public boolean isMultipleof()
		{
		if(one%two ==0)
		{
			return true;
		}
		else
		{
			 return false;
		}}
		
		public static void main(String[] args)
		{
			Happy s1 =new Happy();
			s1.setOne(1);
			s1.setTwo(2);
			
			System.out.println(s1.isMultipleof());
			
		}
		}
	
	
	

