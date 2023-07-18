/*
 * 이진검색 트리 Binary Search Tree 3 -  21-01
 */
package edu.tree;

public class Tree21_01{
	/*
	 # DELETE 시간복잡도 : 0(h)
	 TREE-DELETE(T, z)
	 	if left[x] = NIL or right[z] = NIL
	 		then y <- z
	 		else y <- TREE-SUCCESSOR(z)
	 	if left[y] =! NIL
	 		then x <- left[y]
	 		else x <- right[y]
	 	if x =! NIL
	 		then p[x] <- p[y]
	 	if p[y] = NIL
	 		then root[T] <- x
	 		else if y = left[p[y]]
	 			then left[p[y]] <- x
	 			else right[p[y]] <- x
	 	if y =! z
	 		then key[z] <- key[y]
	 			copy y's satellite data into z
	 	return y
	 
	 # BST
	 - 각종 연산의 시간복잡도 O(h)
	 - 그러나, 최악의 경우 트리의 높이 h=O(n)
	 - 균형잡힌 트리
	 	레드 - 블랙 트리 등
	 	키의 삽입이나 삭제 시 추가로 트리의 균형을 잡아줌으로써 높이를 O(log2n)으로 유지
	 
	 */
}