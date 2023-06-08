/*
 * 순환(Recursion)의 개념과 기본 예제 2-02
 * 문자열의 프린트
 * -> a
 * 	  b
 * 	  c
 */
package edu.recursion;

public class Recursion02_02 {
	public static void main(String[] args) {
		printChars("abc");
	}
	
	public static void printChars(String str){
		if(str.length() ==0) // 문자열의 길이가 0이라면 출력할 게 없음
			return;
		else{
			// 문자열의 첫 글자 출력 후 나머지 문자열을 담아서 함수 다시 실행 
			System.out.println(str.charAt(0));
			// str.substring(1) : 문자열에서 앞의 문자를 제거하고 다시 문자열을 만듦
			printChars(str.substring(1));
		}
	}
}