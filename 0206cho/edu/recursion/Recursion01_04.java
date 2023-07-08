/*
 * 순환(Recursion)의 개념과 기본 예제 1-04
 * 	Factorial : n!
 * 	-> 11
 * 
 * [ Factorial ]
 * 0! = 1
 * n! = nx(n-1) 	n>0
 * 
 * [ 순환함수와 수학적귀납법 ]
 * factorial(int n)은 음이 아닌 정수 n에 대해서 n!을 계산
 * 
 * # 증명
 * 1. n=0인 경우 : n=0인 경우 1을 반환 -> 올바름
 * 2. 임의의 양의 정수 k에 대해서 n<k인 경우 n!을 올바르게 계산한다고 가정
 * 3. n=k인 경우 고려. 
 * 	   factorial은 먼저 factorial(k-1)호출하는데 2번의 가정에 의해서 (k-1)!이 올바로 계산되어 반환
 * 	   따라서 메서드 factorial은 k*(k-1)! = k!을 반환
 */
package edu.recursion;

public class Recursion01_04 {
	public static void main(String[] args) {
		int result = factorial(4);
		System.out.println(result);
	}
	
	public static int factorial(int n){
		if(n==0){
			return 1; 
		}
		else{
			return n+factorial(n-1);
		}
	}
}