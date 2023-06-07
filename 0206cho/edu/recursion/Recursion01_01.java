/*
 * 순환(Recursion)의 개념과 기본 예제 1-01
 * -> 무한 루프 발생
 */
package edu.recursion;

public class Recursion01_01 {
	public static void main(String[] args) {
		func();
	}
	
	public static void func(){
		System.out.println("Hello....");
		func();
	}
}