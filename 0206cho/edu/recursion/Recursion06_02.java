/*
 * Recursion의 응용 : N-Queens 6-02
 * -> false
 */
package edu.recursion;

public class Recursion06_02 {
	private static int N = 8;
	
	static int[] cols = new int [N+1];
	 static boolean queens(int level){
	 	if (!promising(level))
	 		return false;
	 	
	 	// promising 테스트를 통과했다는 가정하에 level==N이면 모든 말이 놓였다는 의미이고 성공이란 뜻!
	 	else if (level == N)
	 		return true;
	 	for (int i=1; i<=N; i++){
	 		cols[level+1] = i;
	 		// level+1번째 말을 각각의 열에 놓은 후 recursion을 호출
	 		if(queens(level+1))
	 			return true;
	 	}
	 	return false;
	 }
	 
	 /*
	  현재 level값 이전은 말들 간에는 충돌이 없음이 보장되어 있음
	  현재 level값은 마지막에 놓인 말이 이전에 놓인 다른 말들과 충돌하는지 검사하는 것으로 충분
	  */
	 // 현재까지 놓인 말들과 충돌을 했는지 안했는지 검사
	 static boolean promising(int level){
		 for (int i=1; i<level; i++){ 
			 if(cols[i] == cols[level]) // 같은 열에 놓였는지 검사
				 return false;
			 else if (level-i == Math.abs(cols[level]-cols[i])) // 같은 대각선에 놓였는지 검사
			 	return false;
		 }
		 return true;
	 }
	 
	 public static void main(String[] args) {
		boolean result = queens(4);
		System.out.println(result);
	}
}