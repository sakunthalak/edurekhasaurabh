package com.edureka.basics;

public class DeclarationbofBoolean {
	int A=10;
	boolean s=true;
	
	void display(double A){
		
		if(A==(int)A) {
			System.out.println("The Given Number is an Integer   "+s);
		}else {
			s=false;
			System.out.println("The Given Number is not an Integer"+s);
		}
	}

	public static void main(String[] args) {
		DeclarationbofBoolean d=new DeclarationbofBoolean() ;
		d.display(20);
		
		
		
	}
}
