/*
 * Hashing 2 -  26-01
 */
package edu.hashing;

public class Hashing26_01{
	/*
	 # Open Addressing에 의한 충돌 해결
	 - 모든 키를 해쉬 테이블 자체에 저장
	 - 테이블의 각 칸(slot)에는 1개의 키만 저장
	 - 충돌 해결 기법
	 	Linear probing
	 	Quadratic probing
	 	Double hashing
	 	
	 # Linear probing
	 - h(k), h(k) + 1, h(k) + 2, ... 순서로 검사하여 처음으로 빈 슬롯에 저장
	   테이블의 끝에 도달하면 다시 처음으로 circular하게 돌아감
	   
	 # 다른 방법들
	 - Linear probing의 단점
	 	primary cluster : 키에 의해서 채워진 연속된 슬롯들을 의미
	 	이런 cluster가 생성되면 이 cluster는 점점 더 커지는 경향이 생김
	 - Quadratic probing
	 	충돌 발생시 h(k), h(k)+1^2, h(k)+2^2, h(k)+3^2, ... 순서로 시도
	 - Double hashing
	 	서로 다른 두 해쉬 함수 h1과 h2를 이용하여
	 		h(k, i) = (h1(k) + i * h2(k)) mod m
	 
	 # Quadratic probing
	 - 충돌 발생 시 h(k), h(k) + 1^2, h(k)  +2^2, h(k) + 3^2, ... 순서로 시도\
	 
	 # Open Addressing - 키의 삭제
	 - 단순히 키를 삭제할 경우 문제가 발생
	 	가령 A2, B2, C2가 순서대로 모두 동일한 해쉬함수 값을 가져서 linear probing으로 충돌 해결
	 - B2를 삭제한 후 C2르 검색
	 	
	  */
}