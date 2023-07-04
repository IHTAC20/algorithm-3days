/*
 * 힙의 다른 유용 : 우선순위와 큐 13-01
 * 
 * - 최대 우선순위 큐는 다음의 두 가지 연산을 지원하는 자료구조
 * 		INSERT(x) : 새로운 원소 x를 삽입
 * 		EXTRACT_MAX() : 최대값을 삭제하고 반환
 * - 최소 우선순위 큐는 EXTRACT-MAX 대신 EXTRACT-MIN을 지원하는 자료구조
 * - MAX HEAP을 이용하여 최대 우선순위 큐를 구현	
 */
package edu.updated;

public class Updated13_01 {
	// INSERT - 시간복잡도 O(log2n)
	/*
	 MAX-HEAP-INSERT(A, key) {
	 	heap_size = heap_size+1;
	 	A[heap_size] = key;
	 	i = heap_size;
	 	while (i > 1 and A[PARENT(i)] < A[i]) {
	 		exchange A[i] and A[PARENT(i)];
	 		i = PARENT(i);
	 	}
	 }
	 */
	
	// EXTRACT_MAX() - 시간복잡도 O(log2n)
	/*
	 HEAP-EXTRACT-MAX(A)
	 if heap-size[A] < 1
	 	then error "heap underflow"
	 max <- A[1]
	 A[1] <- A[heap-size[A]]
	 heap-size[A] <- heap-size[A] -1
	 MAX-HEAPIFY(A, 1)
	 return max
	 */
}