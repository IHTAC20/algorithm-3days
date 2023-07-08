/*
 * 순환(Recursion)의 개념과 기본 예제 2-01
 * 문자열의 길이 계산 
 * 1) 1+ length("bc") : 1 + 2 = 3 
 * 2) 1+ length("c") : 1 + 1
 * 3) 1+ length("") : 1 + 0
 * -> 3
 */
package edu.recursion;

public class Recursion02_01 {
	public static void main(String[] args) {
		int result = length("abc");
		System.out.println(result);
	}
	
	public static int length(String str){
		if(str.equals(""))
			return 0;
		else
			// str.substring(1) : 문자열에서 앞의 문자를 제거하고 다시 문자열을 만듦
			return 1+length(str.substring(1));
	}
}