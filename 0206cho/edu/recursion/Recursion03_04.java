/*
 * 순환(Recursion)의 개념과 기본 예제 3-04
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * [매개변수 명시화] 순차 탐색 다른 버전
 * -> 2
 */
package edu.recursion;

public class Recursion03_04 {
	public static void main(String[] args) {
		int find = 3;
		int start = 1;
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int result = search(arr, start, arr.length-1, find); // 인덱스는 0부터 시작하므로 length-1을 해줘야 함
		System.out.println(result);
	}

	public static int search(int[] data, int begin, int end, int target){
		if(begin > end) // 검색할 데이터의 갯수가 0일 경우
			return -1;
		else{
			int middle = (begin + end)/2; // 중간값을 만들고
			if(data[middle] == target) // 만약 그 중간값이 찾는 값과 같다면 바로 반환
				return middle;
			int index = search(data, begin, middle-1, target); // 그게 아니라면 찾는 위치를 중간지점~시작점으로 이동
			if(index != -1) // 만약 인덱스를 다 돌아서 -1이 될 경우 없는 값이므로 index 리턴
				return index;
			else
				// 중간지점~시작점 다 돌았는데 없으면 중간지점에 인덱스를 하나 더 추가하여 다시 함수 실행
				return search(data, middle+1, end, target); 
			 
		}
	}
}