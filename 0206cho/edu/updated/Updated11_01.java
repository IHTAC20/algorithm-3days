/*
 * 힙정렬 11-01
 * 
 * 최악의 경우 시간복잡도 O(nlog2n)
 * sort in place - 추가 배열 불필요
 * 이진 힙 자료구조 사용
 */
package edu.updated;

public class Updated11_01 {
	/*
	 * 
	   heap은 complete binary tree이면서 heap property를 만족해야 함
	   max heap property : 부모는 자식보다 크거나 같다
	   or
	   min heap property : 부모는 자식보다 작거나 같다
	  
	   full vinary tree : 모든 레벨에 노드들이 꽉 차있는 형태
	   complete vinary tree : 마지막 레벨을 제외하면 완전히 꽉 차있고, 마지막 레벨에는 가장 오른쪽부터 연속된 몇 개의 노드가 비어있을 수 있음
	  
	   힙은 일차원 배열로 표현 가능 : A[1..n]
	   	루트노드 A[1]
	   	A[i]의 부모 = A[i/2]
	  	A[i]의 왼쪽 자식 = A[2i]
	  	A[i]의 오른쪽 자식 = A[2i + 1]
	 */
}