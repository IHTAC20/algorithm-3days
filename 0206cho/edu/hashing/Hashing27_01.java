/*
 * Hashing 3 -  27-01
 */
package edu.hashing;

public class Hashing27_01{
	/*
	 # 좋은 해쉬 함수
	 - 현실에서는 키들이 랜덤하지 않음
	 - 만약 키들의 통계적 분포에 대해 알고 있다면 이를 이용해서 해쉬 함수를 고안하는 것이 가능하겠지만 현실적으로 어려움
	 - 키들이 어떤 특정한 (가시적인) 패턴을 가지더라도 해쉬함수값이 불규칙적이 되도록 하는게 바람직
	 	해쉬 함수 값이 키의 특정 부분에 의해서만 결정되 않아야 함
	 	
	 # 해쉬 함수
	 - Division 기법
	 	h(k) = k mod m
	 	예) m = 20 and k = 91 -> h(k) = 11
	 	장점 : 한번의 mod 연산으로 계산, 따라서 빠름
	 	단점 : 어떤 m값에 대해서는 해쉬 함수값이 키 값의 특정 부분에 의해서 결정되는 경우가 있음
	 		   가령 m = 2^p이면 키의 하위 p비트가 해쉬 함수 값이 됨
	 - Multiplication 기법
	   0에서 1사이의 상수 A를 선택 : 0 < A < 1
	   kA의 소수 부분만을 택함
	   소수 부분에 m을 곱한 후 소수점 아래를 버림
	  - 예) m = 9, word size = w = 5, k = 21
	  	A = 13/32를 선택
	  	kA = 21*13/32 = 273/32 = 8 + 17/32
	  	m (kA mod 1) = 8 * 17/32 = 17/4 = 4. ..
	  	즉 h(21) = 4
	 
	 # Hash code in Java
	 - Java의 object 클래스는 hashCode() 메서드를 가짐
	   따라서 모든 클래스는 hashCode() 메서드를 상속받음. 이 메서드는 하나의 32비트 정수를 반환
	 - 만약 x.equals(y)이면 x.hashCode() == y.hashCode
	   하지만 역은 성립하지 않음
	 - object 클래스의 hashCode() 메서드는 객체의 메모리 주소를 반환하는 것으로 알려져 있음 (but it's implementation-dependent)
	 - 필요에 따라 각 클래스마다 이 메서드를 override하여 사용
	 	ex) Integer 클래스는 정수값을 hashCode로 사용
	   
	  */
}