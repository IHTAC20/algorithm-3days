/*
 * 순환(Recursion)의 개념과 기본 예제 2-05
 * 배열의 합 구하기
 * -> 15
 * 
 * data[0]에서 data[n-1]까지의 합을 구하여 반환
 * 
 */
package edu.recursion;

public class Recursion02_05 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int result = sum(arr.length, arr);
		System.out.println(result);
	}
	
	// n : 배열의 개수, data : 배열
	public static int sum(int n, int[] data){
		if(n <= 0)
			return 0;
		else{
			return sum(n-1, data) + data[n-1];
		}
	}
}