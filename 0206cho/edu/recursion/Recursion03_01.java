/*
 * 순환(Recursion)의 개념과 기본 예제 3-01
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * 순차 탐색 : find에 넣은 값이 있으면 해당하는 인덱스 리턴, 없을 경우 -1 리턴
 * -> 2
 */
package edu.recursion;

public class Recursion03_01 {
	public static void main(String[] args) {
		int find = 3;
		int[] arr = {1, 2, 3, 4, 5, 6};
		int result = search(arr, arr.length, find);
		System.out.println(result);
	}

	// data[0]에서 data[n-1] 사이에서 target을 검색
	// 검색 구간의 시작 인덱스 0은 보통 생략 -> 즉, 암시적 매개변수
	public static int search(int[] data, int n, int target){
		for(int i=0; i<n; i++)
			if(data[i] == target)
				return i;
		return -1;
	}
}