/*
 * 순환(Recursion)의 개념과 기본 예제 1-03
 * 	1-n까지의 합 구함 
 * 	-> 10
 * 
 * [ 순환함수와 수학적귀납법 ]
 * func(int n)은 음이 아닌 정수 n에 대해서 0에서 n까지의 합을 계산
 * 
 * # 증명
 * 1. n=0인 경우 : n=0인 경우 0을 반환 -> 올바름
 * 2. 임의의 양의 정수 k에 대해서 n<k인 경우 0에서 n까지의 합을 올바르게 계산하여 반환한다고 가정
 * 3. n=k인 경우 고려. func은 먼저 func(k-1)호출하는데 2번의 가정에 의해서 0에서 k-1까지의 합이 올바로 계산되어 반환
 * 	   메서드 func은 그 값에 n을 더해서 반환.
 * 	   따라서 메서드 func은 0에서 k까지의 합을 올바르게 계산하여 반환
 */
package edu.recursion;

public class Recursion01_03 {
	public static void main(String[] args) {
		int result = func(4);
		System.out.println(result);
	}
	
	// 0~n까지의 합을 구하는 함수
	public static int func(int n){
		if(n<=0){
			return 0; // n=0일 경우 합은 0
		}
		else{
			// n이 0보다 크다면 0에서 n까지의 합은 0에서 n-1까지의 합에 n을 더한 것
			return n+func(n-1);
		}
	}
}