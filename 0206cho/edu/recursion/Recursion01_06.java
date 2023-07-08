/*
 * 순환(Recursion)의 개념과 기본 예제 1-06
 * fibonacci numbers - 피보나치 수
 * 	-> 3
 * 
 * [ 피보나치 수]
 * f0 = 0
 * f1 = 1
 * fn = fn-1 + fn-2		n>1
 * 
 */
package edu.recursion;

public class Recursion01_06 {
	public static void main(String[] args) {
		int result = fibonacci(4);
		System.out.println(result);
	}
	
	public static int fibonacci(int n){
		if(n<2){
			return n; 
		}
		else{
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}