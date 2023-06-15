/*
 * Recursion의 응용 : N-Queens 6-01
 * 
 * 상태공간트리 : 찾는 해를 포함하는 트리
 * 즉, 해가 존재한다면 그것은 반드시 이 트리의 어떤 한 노드에 해당함
 * 따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있음
 * 
 * 상태공간 트리의 모든 노드를 탐색해야 하는 것은 아님
 * 
 * 
 * 되추적 기법
 * : 상태공간 트리를 깊이 우선 방식으로 탐색하여 해를 찾는 알고리즘
 */
package edu.recursion;

public class Recursion06_01 {
	// Design Recursion
	/*
	return-type queens(arguments) // arguments 매개변수 : 내가 현재 트리의 어떤 노드에 있는지를 지정
	{
		// 꽝 노드인지.
		if non-promisiong
			// 꽝 노드라면 실패 출력 or 리턴 - 문제에 따라 다름
			report failure and return;
		
		// 내가 찾고 있는 노드라면
		else if success
			// 답 출력 or 리턴
			report answer and return;
			
		// 노드에 달려있는 자식 노드를 방문
		else
			visit children recursively;
	}
	 */
	
	/*
	 *  매개변수 level은 현재 노드의 위치을 표현하고,
	 *  1번에서 level 말이 어디에 놓였는지는 전역변수 배열 cols로 표현
	 *  cols[i] = j는 i번 말이 (i행, j열)에 놓였음을 의미
	 
		 int[] cols = new int [N+1];
		 boolean queens(int level){
		 	if (!promising(level))
		 		return false;
		 	
		 	// promising 테스트를 통과했다는 가정하에 level==N이면 모든 말이 놓였다는 의미이고 성공이란 뜻!
		 	else if (level == N)
		 		return true;
		 	else
		 		visit children recursively;
		 }
	 
	 */
}