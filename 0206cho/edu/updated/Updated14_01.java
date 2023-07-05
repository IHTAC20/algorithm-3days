/*
 * 정렬의 lower bound : 14-01
 * comparison Sort
 */
package edu.updated;

public class Updated14_01 {
	/*
	 * [ 정렬 알고리즘의 유형 ]
	 *  # Comparison sort
	 *  - 데이터들간의 상대적 크기관계만을 이용해서 정렬하는 알고리즘 
	 *  - 따라서 데이터들간의 크기 관계가 정의되어 있으면 어떤 데이터에든 적용 가능 (문자열, 알파벳, 사용자 정의 객체 등)
	 *  - 버블소트, 삽입정렬, 합병정렬, 퀵소트, 힙정렬 등
	 *  
	 *  # Non-comparison sort
	 *  - 정렬할 데이터에 대한 사전지식을 이용 - 적용에 제한
	 *  - Bucket sort
	 *  - Radix sort
	 * 	
	 * [ 정렬문제의 하한 ]
	 * # 하한 (Lower bound)
	 * - 입력된 데이터를 한 번씩 다 보기위해서 최소 O(n)의 시간복잡도 필요
	 * - 합병정렬과 힙정렬 알고리즘들의 시간복잡도는 O(nlog2n)
	 * - 어떤 comparison sort알고리즘도 O(nlog2n)보다 나을 수 없음
	 * 
	 * [ Decision Tree ]
	 * - Leaf노드의 개수는 n!개 -> 모든 순열에 해당하기 때문
	 * - 최악의 경우 시간복잡도는 트리의 높이 
	 * - 트리의 높이는 height >= log2n! = O(nlog2n)
	 */
}
