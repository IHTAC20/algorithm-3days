/*
 * 멱집합 powerset : 7-01
 * 
 * 멱집합 : 어떤 집합의 모든 부분 집합의 집합
 * ->
 * f 
 * e 
 * e f 
 * d 
 * d f 
 * d e 
 * d e f 
 * 
 */
package edu.recursion;

public class Powerset07_02 {

	public static void main(String[] args) {
		powerSet(3);
	}
	
	// 문제) data[k], ..., data[n-1]의 멱집합을 구한 후 각각에 include[i] = true, i=0, ..., k-1인 원소를 추가하여 출력
	private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n=data.length;
	private static boolean[] include = new boolean[n];
	
	public static void powerSet(int k){
		if(k==n){
			for (int i=0; i<n; i++)
				if (include[i]) System.out.print(data[i] + " ");
			System.out.println();
			return;
		}
		// data[k] 포함하지 않는 경우
		include[k] = false;
		powerSet(k+1);
		
		// data[k] 포함하는 경우
		include[k] = true;
		powerSet(k+1);
		
		// 처음 이 함수를 호출할 떄는 powerSet(0)로 호출.
		// 즉, P는 공집합이고, S는 전체집합
	}
}