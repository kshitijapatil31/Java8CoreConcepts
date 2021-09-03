package com.bridelabz.mathoperations;


public class MathOperation {
public static void main(String[] args) {
		IMathFunction add=(int a,int b)->a+b;
		System.out.println(add.calculate(10, 20));
		
		
		
		IMathFunction sub=(int a,int b)->a-b;;
		System.out.println(sub.calculate(2, 5));
		
		IMathFunction div=(int a,int b)->a/b;;
		System.out.println("Division"+div.calculate(20, 5));
		
		
		
	}

}
