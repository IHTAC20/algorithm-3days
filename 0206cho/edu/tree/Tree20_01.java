/*
 * 이진검색 트리 Binary Search Tree 2 -  20-01
 */
package edu.tree;

public class Tree20_01{
	/*
	 # Successor
	 - 노드 x의 successor란 key[x]보다 크면서 가장 작은 키를 가진 노드
	 - 모든 키들이 서로 다르고 가정
	 - 3가지 경우
	 	노드 x의 오른쪽 부트리가 존재할 경우, 오른쪽 부트리의 최소값
	 	오른쪽 부트리가 없는 경우 어떤 노드 y의 왼쪽 부트리의 최대값이 x가 되는 그런 노드 y가 x의 successor
	 		부모를 따라 루트까지 올라가면서 처음으로 누군가의 왼쪽 자식이 되는 노드
	 	그런 노드 y가 존재하지 않을 경우 successor가 존재하지 않음 (즉, x가 최대값)
	 	
	 - 시간 복잡도 : 0(h)
	 TREE-SUCCESSOR(x)
	 	if right[x] =! NIL
	 		then return TREE-MINIMUM(right[x])
	 	y <- p[x]
	 	while y =! NIL and x = right[y]
	 		do x <- y
	 		   y <- p[y]
	 	return y
	 
	 # Predecessor
	 - 노드 x의 predecessor란 key[x]보다 작으면서 가장 큰 키를 가진 노드
	 - Successor와 반대
	 
	 # INSERT 시간 복잡도 : O(h)
	 TREE-INSERT(T, z)
	 	y <- NIL
	 	x <- root[T]
	 	while x =~ NIL
	 		do y <- x
	 			if key[z] < key[x]
	 				then x <- left[x]
	 				else x <- right[x]
	 	p[z] <- y
	 	if y = NIL
	 		then root[T] <- z
	 		else if key[z] < key[y]
	 			then left[y] <- z
	 			else right[y] <- z
	 
	 */
}