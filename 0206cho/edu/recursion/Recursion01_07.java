/*
 * 순환(Recursion)의 개념과 기본 예제 1-07
 * Euclid Method 최대공약수
 * 	-> 2.0
 * 
 * m >= n인 두 양의 정수 m과 n에 대해서 m이 n의 배수이면 gcd(m,n) =n이고, 
 * 그렇지 않으면 gcd(m, n) = gcd(n, m%n)이다.
 * 
 */
package edu.recursion;

public class Recursion01_07 {
	public static void main(String[] args) {
		double result = gcd(2,4);
		System.out.println(result);
	}
	
	public static double gcd(int m, int n){
		if(m<n){
			// swap m and n
			int tmp =m;
			m =n;
			n =tmp;
		}
		if(m%n == 0){
			return n;
		}
		else{
			return gcd(n, m%n);
		}
	}
}