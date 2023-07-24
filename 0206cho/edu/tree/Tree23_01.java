/*
 * red-black tree 2 -  23-01
 */
package edu.tree;

public class Tree23_01{
	/*
	 # INSERT
	 - 보통 BST에서처럼 노드를 INSERT함
	 - 새로운 노드 z를 red노드로 함
	 - RB-INSERT-FIXUP을 호출함
	 
	 # RB-INSERT-FIXUP
	 - Loop Invariant :
	 	z는 red노드
	 	오직 하나의 위반만이 존재
	 		조건2) z가 루트노드이면서 red이거나,
	 		조건4) z와 그 부모 p[z]가 둘 다 red이거나
	 	종료조건
	 		부모노드 p[z]가 black이 되면 종료
	 		조건2가 위반일 경우 z을 블랙으로 바꿔주고 종료
	 	
	 * 경우1 : z의 삼촌이 red
	 - 조건 2와 4이외의 조건들을 여전히 ok 면서 z가 두 칸위로 올라감
	 
	 * 경우2와 3 : z의 삼촌이 black
	 경우2) z가 오른쪽 자식인 경우
	 	- p[z]에 대해서 left-rotation한 후 원래 p[z]를 z로
	 	- 경우3으로
	 경우3) : z가 왼쪽 자식인 경우
	 	- p[z]를 black, p[p[z]]를 red로 바꿈
	 	- p[p[z]]에 대해서 right-rotation
	 */
}