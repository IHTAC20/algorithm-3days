/*
 * 순환(Recursion)의 개념과 기본 예제 2-06
 * 데이터파일로부터 n개의 정수 읽어오기
 * 잘 사용하지는 않음. 이렇게 할 수도 있다 정도만!
 * 
 * Scanner in이 참조하는 파일로부터 n개의 정수를 입력받아 배열 data의 data[0], ..., data[n-1]에 저장
 * 
 */
package edu.recursion;

import java.util.Scanner;

public class Recursion02_06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = 3;
		int[] arr = new int[size];
		readFrom(size, arr, in);
	}
	
	// n : 배열의 개수, data : 배열
	public static void readFrom(int n, int[] data, Scanner in){
		if(n == 0)
			return ;
		else{
			readFrom(n-1, data, in);
			data[n-1] = in.nextInt();
		}
	}
}

/*
 * 모든 순환함수는 반복문(iteration)으로 변경 가능
 * 그 역도 성립. 즉 모든 반복문은 recursion으로 표현 가능
 * 순환함수는 복잡한 알고리즘을 단순하고 알기쉽게 표현하는 것을 가능하게 함
 * 하지만 함수 호출에 따른 오버해드가 있음
 * (매개변수 전달, 액티베이션 프레임 생성 등)
 * */
