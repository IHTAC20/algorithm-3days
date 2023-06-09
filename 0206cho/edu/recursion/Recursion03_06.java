/*
 * 순환(Recursion)의 개념과 기본 예제 3-06
 * 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꾸기!
 * 
 * [매개변수 명시화] 최대값 찾기 다른 버전
 * -> 6
 */
package edu.recursion;

public class Recursion03_06 {
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
		else{
			int middle = (begin + end)/2; // 중간 값을 구한 후
			int max1 = findMax(data, begin, middle); // 처음~중간 값 사이의 최대 값을 찾고
			int max2 = findMax(data, middle+1, end); // 중간~끝 사이의 최대값을 찾아서
			return Math.max(max1, max2); // 그 두 값을 비교
		}
	}
}