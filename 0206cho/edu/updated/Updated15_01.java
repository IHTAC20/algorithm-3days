/*
 * 선형시간 정렬 알고리즘 - sorting in linear time :  15-01
 */
package edu.updated;

public class Updated15_01 {
	/*
	 # Counting Sort
	 - n개의 정수를 정렬해라. 단 모든 정수는 0에서 k사이의 정수임.
	 ex) n명의 학생들의 시험정수를 정렬해라. 단 모든 점수는 100이하의 양의 정수임.
	 
	 int A[n];
	 int C[k] = {0, };
	 for (int i=1; i<=n; i++)
	 	C[A[i]]++;
	 for (int s=1, i=0; i<=k; i++)
	 {
	 	for(int j=0; j<=c[i]; j++)
	 	{
	 		A[s++] = j;
	 	}
	 }
	 
	 Is it okay? -> No. 대부분의 경우 정렬할 key값들은 레코드의 일부분이기 때문
	 
	 # 시간복잡도
	 - O(n+k), 또는 O(n) if k=0(n)
	 - k가 클 경우 비실용적
	 - stable 정렬 알고리즘
	 	입력에 동일한 값이 있을 때 입력에 먼저 나오는 값이 출력에서도 먼저 나옴
	 	Counting정렬은 stable함
	 */
}