package com.learning;

class Calculations {
	
	int z;
	
	 public void Subtraction(int a,int b)
	    {
		 z=a-b;
	     System.out.println( "Difference : "+ z );
	    }
	 public void addition(int a,int b) 
	 {
		 z= a+b;
		 System.out.println("Addition : "+z);
	 }
}

public class My_Calculation extends Calculations{
	
	public void multiplication(int x, int y) {		
		z = x*y;
		System.out.println("Multipliction :" +z);
	}
	
	public static void main (String arg[]) {
		int a= 20, b = 12;
		My_Calculation demo = new My_Calculation();
		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);		
	}
}