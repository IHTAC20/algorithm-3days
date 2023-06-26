/*
 * 빠른정렬 10-01
 정복 : 각 부분을 순환적으로 정렬
 합병 : nothing to do
 
# Quicksort
1. 정렬할 배열이 주어짐. 마지막 수를 기준(pivot)으로 삼음
2. 기준보다 작은 수는 기준의 왼쪽에 나머지는 기준의 오른쪽에 오도록 재배치(분할)함\
3. 기준의 왼쪽과 오른쪽을 각각 순환적으로 정렬 (정렬 완료)
 */
package edu.updated;

public class Updated10_01 {
	
	/*
	quickSort(A[], p, r)
	{
		if(p<r) thwen {
			q = partition(A, p, r); // 분할
			quickSort(A, p, q-1); // 왼쪽 부분배열 정렬
			quickSort(A, p, q+1); // 오른쪽 부분배열 정렬
		}
	}
	
	partition(A[], p, r)
	{	
		배열 A[p ... r]의 원소들을 A[r]을 기준으로 양쪽으로 재배치하고
		A[r]이 자리한 위치를 return함
		
		x <- A[r];
		i <- p - 1;
		for j <- p to r-1
		if A[j] <= x then
			i <- i + 1;
			exchange A[i] and A[j];
		exchange A[i+1] and A[r];
		return i+1;
	}
	*/
	
	/*
	 # Pivot의 선택
	 - 첫번째 값이나 마지막 값을 피봇으로 선택
	 	이미 정렬된 데이터 혹은 거꾸로 정렬된 데이터가 최악의 경우
	 	현실의 데이터는 랜덤하지 않으므로 (거꾸로) 정렬된 데이터가 입력으로 들어올 가능성은 매우 높음
	 	따라서 좋은 방법이라고 할 수 없음
	 	
	 - Median of Three
	 	첫번째 값과 마지막 값, 그리고 가운데 값 중에서 중간값을 피봇으로 선택\
	 	최악의 경우 시간 복잡도가 달라지지는 않음
	 	
	 -  Randomized Quicksort
	 	피봇을 랜덤하게 선택
	 	no worst case instance, but worst case execution
	 	평균 시간복잡도 o(nlogN)
	 */
	 
}