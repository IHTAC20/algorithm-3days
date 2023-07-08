/*
 * 순환(Recursion)의 개념과 기본 예제 3-05
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * [매개변수 명시화] 최대값 찾기
 * -> 6
 */
package edu.recursion;

public class Recursion03_05 {
	public static void main(String[] args) {
		int start = 1;
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		int result = findMax(arr, start, arr.length-1);
		System.out.println(result);
	}

	// data[begin]에서 data[end] 사이에서 최대값 찾아서 반환. begin <= end라고 가정
	public static int findMax(int[] data, int begin, int end){
		if(begin == end) // 시작점과 끝점이 같을 경우 배열의 값은 하나이므로 그 값을 최대 값으로 리턴
			return data[begin];
		else
			// findMax(data, begin+1, end) 여기 안에서 최대 값을 찾은 후
			// 그 값과 data[begin] 이 값을 비교
			return Math.max(data[begin], findMax(data, begin+1, end));
	}
}