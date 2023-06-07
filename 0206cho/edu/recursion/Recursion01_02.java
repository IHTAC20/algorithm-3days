/*
 * 순환(Recursion)의 개념과 기본 예제 1-02
 * 	조건을 걸어줄 경우 무한루프 발생하지 않음
 * 	-> Hello.... 4번 출력
 */
package edu.recursion;

public class Recursion01_02 {
	public static void main(String[] args) {
		func(4);
	}
	
	public static void func(int n){
		// Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 함
		if(n<=0){
			return;
		}
		// Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야 함
		else{
			System.out.println("Hello....");
			func(n-1);
		}
	}
}