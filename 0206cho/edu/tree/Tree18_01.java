/*
 * 이진검색 트리 : 트리와 이진트리 -  18-01
 */
package edu.tree;

public class Tree18_01{
	/*
	 # 트리 Tree
	 - 계층적인 구조를 표현
	 	ex)
		 	조직도
		 	디렉토리와 서브디렉토리 구조
		 	가계도
	 - 부모-자식 관계를 확장한 것이 조상-자손 관계
	 
	 # 트리의 기본적인 성질
	 - 노드가 n개인 트리는 항상 n-1개의 링크(link)를 가짐
	 - 트리에서 루트에서 어떤 노드로 가는 경로는 유일.
	   또한 임의의 두 노드간의 경로도 유일 (같은 노드를 두 번 이상 방문하지 않는다는 조건하에)
	   
	 # 이진 트리 (binary tree)
	 - 이진 트리에서 각 노드는 최대 2개의 자식을 가짐
	 - 각각의 자식 노드는 자신이 부모의 왼쪽 자식인지 오른쪽 자식인지가 지정됨 (자식이 한 명인 경우에도)
	 - 이진 트리 응용의 예시 : Expression Tree, Huffman Code, Full and Complete Binary Trees
	 
	 # Full and Complete Binary Trees
	 - 높이가 h인 full binary tree는 2^h-1개의 노드를 가짐
	 - 노드가 n개인 full혹은 complete 이진 트리의 높이는 O(logN)임
	   노드가 n개인 이진트리의 높이는 최악의 경우 n이 될 수도 있음
	   
	 # 이진트리의 표현
	 * 연결 구조 표현
	 	: 각 노드에 하나의 데이터 필드와 왼쪽 자식, 오른쪽 자식, 그리고 부모 노드의 주소를 저장
	 	 (부모 노드의 주소는 반드시 필요한 경우가 아니면 보통 생략)
	 	- 루트 노드의 주소는 따로 보관
	 	
	 # 이진트리의 순회 (traversal)
	 - 순회 : 이진 트리의 모든 노드를 방문하는 일
	 - 중순위 순회
	 - 선순위 순회
	 - 후순위 순회
	 - 레벨오더 순회
	 	
	 # 이진트리의 Inorder-순회
	 1. 먼저 TL을 inorder로 순회하고
	 2. r을 순회하고
	 3. TR을 inorder로 순회
	 (이진 트리를 루트노드 r, 왼쪽 부트리 TL, 오른쪽 부트리 TR로 나누어 생각)
	 
	 # Postorder와 Preorder 순회
	 * PREORDER-TREE-WALK(x)
	 	if x != NIL
	 	then print key[x]
	 		 PRE-ORDER-TREE-WALK(left[x])
	 		 PRE-ORDER-TREE-WALK(right[x])
	 		 
	 * POSTORDER-TREE-WALK(x)
	 	if x != NIL
	 	then print key[x]
	 		 POST-ORDER-TREE-WALK(left[x])
	 		 POST-ORDER-TREE-WALK(right[x])
	 		 print key[x]
	 		 
	 # Expression Trees
	 - Expression 트리를 inorder 순회 시 x + y * a + b / c 로 출력
	 - 각 부트리르 순회 시 시작과 종료 시에 괄호를 추가하면 (x + y) * ((a + b) / c) 로 올바른 수식 출력됨
	 - Postorder 순회 시 후위표기식이 출력 : x y + a b + c / * 
	 
	 # Level-Order 순회
	 - 레벨 순으로 방문, 동일 레벨에서는 왼쪽에서 오른쪽 순서
	 - 큐를 이용하여 구현
	 
	 LEVEL-ORDER-TREE-TRAVERSAL()
	 	visit the root;
	 	Q <- root;	// Q is a queue
	 	while Q is not empty do
	 		v <- dequeue(Q);
	 		visit children of v;
	 		enqueue children of v into Q;
	 	end
	 end
	 */
}