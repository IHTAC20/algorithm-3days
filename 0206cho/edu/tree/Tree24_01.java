/*
 * red-black tree 3 -  24-01
 */
package edu.tree;

public class Tree24_01{
	/*
	 # DELETE
	 - 보통 BST에서처럼 노드를 DELETE함
	 - 실제로 삭제된 노드 y가 red였으면 종료
	 - y가 black이었을 경우 RB-DELETE-FIXUP을 호출
	 
	 # RB-DELETE-FIXUP(T, x)
	 1. ok
	 2. y가 루트였고 x가 red인 경우 위반
	 3. ok
	 4. p[y]와 x가 모두 red일 경우 위반
	 5. 원래 y를 포함했던 모든 경로는 이제 black노드가 하나 부족
	 	1) 노드 x에 "extra black"을 부여해서 일단 조건5를 만족
	 	2) 노드 x는 "double black"혹은 "red & black"
	 * 아이디어 : 
	 - extra black을 트리의 위쪽으로 올려보냄
	 - x가 red & black 상태가 되면 그냥 black노드로 만들고 끝냄
	 - x가 루트가 되면 그냥 extra black을 제거
	 * Loop Invariant
	 - x는 루트가 아닌 double-black 노드
	 - w는 x의 형제노드
	 - w는 NIL노드가 될 수 없음 (아니면 x의 부모에 대해 조건5가 위반)
	 
	 * 경우1 : w가 red 인경우
	 - w의 자식들은 black
	 - w를 black으로, p[x]를 red로
	 - p[x]에 대해서 left-rotation 적용
	 - x의 새로운 형제노드는 원래 w의 자식노드, 따라서 black노드
	 - 경우 2,3, 혹은 4에 해당
	 
	 * 경우2 :  w는 black, w의 자식들도 black
	 - x의 extra-black을 뺏고, w를 red로 바꿈
	 - p[x]에게 뺏은 extra-black을 줌
	 - p[x]를 새로운 x로 해서 계속
	 - 만약 경우1에서 이 경우에 도달했다면 p[x]는 red였고, 따라서 새로운 x는 red & black이 되어서 종료
	 
	 * 경우3 : w는 black, w의 왼쪽자식이 red
	 - w를 red로, w의 왼자식을 black으로
	 - w에 대해서 right-rotation 적용
	 - x의 새로운 형제 w는 오른자식이 red : 경우4에 해당
	 
	 * 경우4 : w는 black, w의 오른쪽자식이 red
	 - w의 색을 현재 p[x]의 색으로 (unknown color)
	 - p[x]를 black으로, w의 오른쪽 자식을 black으로
	 - p[x]에 대해서 left-rotation 적용
	 - x의 extra-black을 제거하고 종료
	 
	 * 경우 5, 6, 7, 8
	 - 경우 1,2,3,4는 x가 왼쪽 자식인 경우
	 - 경우 5,6,7,8은 x가 p[x]의 오른쪽 자식인 경우
	 	경우 1,2,3,4와 각각 대칭적임
	  */
}