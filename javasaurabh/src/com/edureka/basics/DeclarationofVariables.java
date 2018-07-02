package com.edureka.basics;

public class DeclarationofVariables {
	
	int a;
	double b;
	char c;
	DeclarationofVariables(){
		a=10;
		b=83.57;
		c='C';
	}
	
	void display() {
		System.out.println("The Value of the Variables a,b,c are"+"  "+a+", "+b+", "+c);
	}
	
	
	public static void main(String[] args) {
		
		DeclarationofVariables d=new DeclarationofVariables();
		d.display();
		
	}

}
