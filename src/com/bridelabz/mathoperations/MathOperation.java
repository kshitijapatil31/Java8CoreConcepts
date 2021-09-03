package com.bridelabz.mathoperations;


public class MathOperation {
public static void main(String[] args) {
		IMathFunction add=(int a,int b)->a+b;
		System.out.println(add.calculate(10, 20));
		
		IMathFunction add1=Math::addExact;
		System.out.println(add1.calculate(2, 5));
		
		IMathFunction sub=(int a,int b)->a-b;;
		System.out.println(sub.calculate(2, 5));
		
		IMathFunction div=(int a,int b)->a/b;;
		System.out.println("Division"+div.calculate(20, 5));
		
		IMathFunction highestNumber=(a,b)->{
			if(a>b)
				return a;
			else
				return b;
		};
		System.out.println(highestNumber.calculate(2,5));
		
		
		IMathFunction.printResult(2,5,"addition",add);
		IMathFunction.printResult(2,5,"addition",add);
		IMathFunction.printResult(2,5,"Division",div);
		
	}

}
