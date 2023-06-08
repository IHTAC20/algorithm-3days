/*
 * 순환(Recursion)의 개념과 기본 예제 2-04
 * 2진수로 변환하여 출력
 * -> 1010
 * 
 * 음이 아닌 정수 n을 이진수로 변환하여 인쇄
 * 
 */
package edu.recursion;

public class Recursion02_04 {
	public static void main(String[] args) {
		printInBinary(10);
	}
	
	public static void printInBinary(int n){
		if(n < 2)
			System.out.print(n); // n을 2로 나눈 몫을 먼저 2진수로 변환하여 인쇄한 후
		else{
			printInBinary(n/2);
			
			// 마지막비트는 n을 2로 나눴을 때와 같음, 즉 짝수 : 0, 홀수 : 1
			System.out.print(n%2); // n을 2로 나눈 나머지를 인쇄
		}
	}
}