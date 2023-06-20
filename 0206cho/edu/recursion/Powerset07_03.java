/*
 * 멱집합 powerset : 7-03
 * 
 * 상대공간트리 state space tree
 * - 해를 찾기 위해 탐색할 필요가 있는 모든 후보들을 포함하는 트리
 * - 트리의 모든 노드들을 방문하면 해를 찾을 수 있음
 * - 루트에서 출발하여 체계적으로 모든 노드를 방문하는 절차를 기술
 * 
 */
package edu.recursion;

public class Powerset07_03 {
	
	public static void main(String[] args) {
		powerSet(3);
	}
	
	private static char data[] = {'a', 'b', 'c', 'd', 'e', 'f'};
	private static int n=data.length;
	private static boolean[] include = new boolean[n]; // include : 트리상에서 현재 나의 위치를 표현
	
	public static void powerSet(int k){ // k : 트리상에서 현재 나의 위치를 표현
		if(k==n){ // n : 만약 내 위치가 리프노드일 경우
			for (int i=0; i<n; i++)
				if (include[i]) System.out.print(data[i] + " ");
			System.out.println();
			return;
		}
		// data[k] 포함하지 않는 경우
		include[k] = false;
		powerSet(k+1); // 먼저 왼쪽으로 내려갔다가
		
		// data[k] 포함하는 경우
		include[k] = true;
		powerSet(k+1); // 이번엔 오른쪽으로 내려감
	}
}
