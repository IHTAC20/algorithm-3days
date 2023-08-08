/*
 * 순회 : 그래프에서의 BFS - 30-01
 */
package edu.graph;

public class Graph30_01{
	/*
	 # 깊이우선순회 (DFS)
	 1. 출발점 S에서 시작
	 2. 현재 노드를 visited로 mark하고 인접한 노드들 중 unvisited 노드가 존재하면 그 노드로 감
	 3. 2번을 계속 반복
	 4. 만약 unvisited인 이웃 노드가 존재하지 않는 동안 계속해서 직전 노드로 되돌아 감
	 5. 다시 2번을 반복
	 6. 시작노드 s로 돌아오고 더 이상 갈 곳이 없으면 종료
	 
	 # DFS 깊이 우선 탐색
	 DFS(G, V)
	 	visited[v] <- YES;
	 	for each node adjacent to x do
	 		if visited[v] = NO then
	 			DFS(G, u);
	 		end
	 	end
	 	
	 - 그래프가 disconnected이거나 혹은 방향 그래프라면 DFS에 의해서 모든 노드가 방문되지 않을 수도 있음
	 - DFS를 반복하여 모든 노드 방문
	  */
}