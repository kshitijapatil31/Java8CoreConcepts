package com.bridelabz.mathoperations;
@FunctionalInterface
public interface IMathFunction {
	int calculate(int a,int b);
	public static void printResult(int a,int b,String function,IMathFunction fobj) {
		System.out.println(function+fobj.calculate(a,b));
	};
}
