/*
 * 기본적인 정렬 알고리즘 8-01
 
 # Selection Sort
 - 각 루프마다 최대 원소를 찾음
 - 각 루프마다 최대 원소와 맨 오른쪽 원소를 교환
 - 각 루프마다 맨 오른쪽 원소를 제외함
 
 - 하나의 원소만 남을 떄까지 위의 루프를 반복
 
 */
package edu.updated;

public class Updated08_01 {
	
	/*
	 selectionSort(A[], n) // 배열 A[1 ... n]을 정렬
	 {
	 	for last <- n downto 2 { // for 루프는 n-1번 반복
	 		A[1 ... last] 중 가장 큰 수 A[k]를 찾음 // 가장 큰 수를 찾기 위한 비교횟수 : n-1, n-2, ..., 2, 1
	 		A[k] <-> A[last]; // A[k]와 A[last]의 값을 교환
	 	}
	 }
	 
	 시간복잡도 T(n) = (n-1) + (n-2) + ... + 2 + 1 = 0(n^2)
	 */
	
	/*
	 bubbleSort(A[], n) // 배열 A[1 ... n]을 정렬
	 {
	 	for last <- n downto 2 { // for 루프는 n-1번 반복
	 		for i <- 1 to last-1 // for 루프는 각각 n-1, n-2, ..., 2, 1번 반복
	 			if(A[i] > A[i+1]) then A[i] <-> A[i];  // 교환 - 교환은 상수시간 작업 
	 	}
	 }
	 
	 시간복잡도 T(n) = (n-1) + (n-2) + ... + 2 + 1 = 0(n^2)
	 */
	
	/*
	 insertionSort(A[], n) // 배열 A[1 ... n]을 정렬
	 {
	 	for i <- 2 to n  // for 루프는 n-1번 반복
	 		A[1 ... i]의 적당한 자리에 A[i]를 삽입 // 삽입은 최악의 경우 i-1번 비교
	 }
	 
	 최악의 경우 : T(n) = (n-1) + (n-2) + ... + 2 + 1 = 0(n^2)
	 */
	
}