/*
 * 순환(Recursion)의 개념과 기본 예제 2-03
 * 문자열을 뒤집어 프린트
 * -> c
 * 	  b
 * 	  a
 * 
 * 첫 글자를 제외한 문자열을 뒤집어 프린트 한 후 마지막으로 첫 글자를 프린트
 */
package edu.recursion;

public class Recursion02_03 {
	public static void main(String[] args) {
		printCharsReverse("abc");
	}
	
	public static void printCharsReverse(String str){
		if(str.length() ==0) // 문자열의 길이가 0이라면 출력할 게 없음
			return;
		else{
			printCharsReverse(str.substring(1));
			System.out.println(str.charAt(0));
		}
	}
}