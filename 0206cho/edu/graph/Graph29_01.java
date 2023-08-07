/*
 * 순회 : 그래프에서의 BFS - 29-01
 */
package edu.graph;

public class Graph29_01{
	/*
	 # 그래프 순회
	 - 순회 (traversal)
	 	: 그래프의 모든 노드들을 방문하는 일
	 - 대표적 두 가지 방법
	 	BFS (Breadth-First Search, 너비 우선 순회)
	 	DFS (Depth-First Search, 깊이 우선 순회)
	 	
	 # 너비 우선 순회 (BFS)
	 - BFS 알고리즘은 다음 순서로 노드들을 방문
	 	L0 = {s}, 여기서 s는 출발 노드
	 	L1 = L0의 모든 이웃 노드들
	 	L2 = L1의 이웃들 중 L0에 속하지 않는 노드들
	 	Li = Li-1의 이웃들 중 Li-2에 속하지 않는 노드들
	 	-> 동심원 형태
	 	
	 # 큐를 이용한 너비우선 순회
	 1. check the start node; // 체크 : 이미 방문된 노드라는 표시
	 2. insert the start node into the queue;
	 while the queue is not empty do
	 	remove a node v from queue;
	 	for each unchecked neighbour w of v do
	 		check and insert w into the queue;
	 		
	 # BFS와 최단경로
	 - s에서 Li에 속한 노드까지의 최단 경로의 길이는 i -> 여기서 경로의 길이는 경로에 속한 에지의 개수를 의미
	 - BFS를 하면서 각 노드에 대해서 최단 경로의 길이를 구할 수 있음

	 - 입력 : 방향 혹은 무방향 그래프 G-(V, E), 그리고 출발노드 
	 - 출력 : 모든 노드 v에 대해서
	 	d[v] = s로부터 v까지의 최단 경로의 길이(에지의 개수)
	 	파이[v] = s로부터 v까지의 최단 경로 상에서 v의 직전 노드(predecessor)
	  */
}