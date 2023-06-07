/*
 * 순환(Recursion)의 개념과 기본 예제 1-05
 * 	x^n
 * 	-> 16.0
 * 
 * [ x^n ]
 * x^0 = 1
 * x^n = x*x^n-1 	if n>0
 * 
 */
package edu.recursion;

public class Recursion01_05 {
	public static void main(String[] args) {
		double result = power(2, 4);
		System.out.println(result);
	}
	
	public static double power(double x, int n){
		if(n==0){
			return 1; 
		}
		else{
			return x*power(x, n-1);
		}
	}
}