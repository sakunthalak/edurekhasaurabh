package com.edureka.basics;

public class GreatestnuminThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=25,c=25;
		if(a>b)
		{
			if(a>c) 
			{
				System.out.println(a+"is big");
			}
			else if(a==c)
			{
				System.out.println(a+c+"are big");
			}
			System.out.println(c+"is big");
		  }
		else if(a==b)
		{
			if(a>c) 
			{
				System.out.println(a+b+"are big");
			}
			else if(a==c) 
			{
				System.out.println(a+b+c+" are big");
			}
			else {
				System.out.println(c+"is big");
			}
			
		}
		else 
		{if(b>c) 
			{
			System.out.println("b is big");
			}
		else if(b==c)
			{
				System.out.println("b c are big");
			}
		else
			System.out.println("a is big");
		}
		
		
		
		
		
}
}
