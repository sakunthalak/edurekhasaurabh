package com.edureka.basics;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int year=1964;
	boolean leap;
	if(year%4==0)
	{ if(year%100==0)
		{if(year%400==0) 
		{
			System.out.println(year+"  is a leap year");		
		}
		System.out.println(year+"  is not a leap year");			
		
		}
	else
		System.out.println(year+"  is a leap year");
	
	}else
		System.out.println(year+"  is not leap year");
	}

}
