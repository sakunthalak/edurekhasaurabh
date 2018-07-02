package com.edureka.basics;

public class EgArithmatic {

int A=20,B=25;

void Add() {
	int Total=Math.addExact(A,B);
	System.out.println("The sum of two numbers:"+Total);
}
void Sub() {
	int Total=Math.subtractExact(A, B);
	System.out.println("The Difference of two numbers:"+Total);
}
void Mul() {
	int Total=Math.multiplyExact(A, B);
	System.out.println("The Multiplication of two numbers:"+Total);
}
void Div() {
	float Total=Math.multiplyExact(A, B);
	System.out.println("The Divison of two numbers:"+Total);
}
void Mod() {
	float Total=Math.floorMod(A, B);
	System.out.println("The Mod of two numbers:"+Total);
}

	
	public static void main(String[] args) {

		EgArithmatic AA=new EgArithmatic();
		AA.Sub();
		AA.Mul();
		AA.Div();
		AA.Add();
		AA.Mod();
		
	}

}
