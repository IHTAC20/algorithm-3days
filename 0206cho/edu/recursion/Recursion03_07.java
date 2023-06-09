/*
 * 순환(Recursion)의 개념과 기본 예제 3-07
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * Binary Search - 이진 검색 : 데이터가 정렬되어 있는 배열에서 특정한 값을 찾기
 * -> 1
 */
package edu.recursion;

public class Recursion03_07 {
	public static void main(String[] args) {
		int start = 1;
		String[] arr = {"찰리", "스누피", "우드스탁"};
		String find = "스누피";
		int result = binarysearch(arr, find, start, arr.length-1);
		System.out.println(result);
	}

	// items[begin]에서 items[end] 사이에서 target을 검색
	public static int binarysearch(String[] items, String target, int begin, int end){
		if(begin > end)
			return -1;
		else{
			int middle = (begin + end)/2; // 인덱스의 중간 값을 구한 후
			int compResult = target.compareTo(items[middle]); // compareTo : 문자열 비교 - 작으면 음수, 같으면 0, 크면 양수
			if(compResult == 0)
				return middle;
			else if (compResult < 0)
				return binarysearch(items, target, begin, middle-1);
			else
				return binarysearch(items, target, middle+1, end);
		}
	}
}