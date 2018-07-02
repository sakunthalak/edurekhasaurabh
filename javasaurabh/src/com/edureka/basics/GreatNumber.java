package com.edureka.basics;

public class GreatNumber {
	int A=25;
	int B=65;
	
	void Greatest() {
		if(A!=B)
		{ if(A==0)
		    {System.out.println(B+"is the Biggest Number");}
		  else if(B==0)
			{System.out.println(A+"is the Biggest Number");}
		   else if(A>B)
		    {System.out.println(A+"is the Biggest Number");}
		
		   else System.out.println(B+"is the Biggest Number");
			   	
		}else
			System.out.println("Both are Equal");
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreatNumber gg=new GreatNumber();
		gg.Greatest();
		
		

	}

}
