/*
 * 순환(Recursion)의 개념과 기본 예제 3-02
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * [매개변수 명시화] 순차 탐색 
 * -> 2
 */
package edu.recursion;

public class Recursion03_02 {
	public static void main(String[] args) {
		int find = 3;
		int start = 1;
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		// search(data, 0, n-1, target)으로 호출하면 03-01과 동일한 기능
		int result = search(arr, start, arr.length-1, find); // 인덱스는 0부터 시작하므로 length-1을 해줘야 함
		System.out.println(result);
	}

	// data[begin]에서 data[end] 사이에서 target을 검색
	// 검색 구간의 시작점을 명시적으로 지정
	public static int search(int[] data, int begin, int end, int target){
		if(begin > end) // 검색할 데이터의 갯수가 0일 경우
			return -1;
		else if(target == data[begin]) // 찾으려고 시작하는 위치가 찾는 값일 경우 바로 그 지점을 반환
			return begin;
		else
			return search(data, begin+1, end, target); // 그게 아니라면 찾는 시점을 +1 해줘서 다음 인덱스의 값과 비교
	}
}