/*
 * 멱집합 powerset : 7-01
 * 
 * 멱집합 : 어떤 집합의 모든 부분 집합의 집합
 * 
 *  {a, b, c, d, e, f}의 모든 부분집합을 나열하려면
 *  a를 제외한 {b, c, d, e, f}의 모든 부분집합들을 나열하고
 *  {b, c, d, e, f}의 모든 부분집합에 {a}를 추가한 집합들을 나열
 *  
 *  {b, c, d, e, f}의 모든 부분집합에 {a}를 추가한 집합들을 나열하려면
 *  {c, d, e, f}의 모든 부분집합들에 {a}를 추가한 집합들을 나열하고
 *  {c, d, e, f}의 모든 부분집합에 {a, b}를 추가한 집합들을 나열
 *  
 *  // {c, d, e, f} : 집합 s = k 번째부터 마지막 원소까지 연속된 원소들
 *  // {a, b} : 집합 P = 처음부터 k-1 번째 원소들 중 일부
 *  
 *  {c, d, e, f}의 모든 부분집합에 {a}를 추가한 집합들을 나열하려면
 *  {d, e, f}의 모든 부분집합들에 {a}를 추가한 집합들을 나열하고
 *  {d, e, f}의 모든 부분집합에 {a, c}를 추가한 집합들을 나열
 *  
 * 
 */
package edu.recursion;

public class Powerset07_01 {
	
	/*
	 문제) S의 멱집합을 출력
	 poserSet(s)
	 if s is an empty set
	 	print nothing;
	 else
	 	let t be the first element of s;
	 	find all subsets of s-{t} by calling powerSet(S-{t});
	 	print the subsets;
	 	print the subsets with adding t;
	 	
	 // 이렇게 하기 위해선 powerSet 함수는 여러 개의 집합들을 return해야함
	 
	 문제) S의 멱집합을 구한 후 각각에 집합 P를 합집합하여 출력
	 powerSet(P, S)
	 if s is an empty set
	 	print P;
	 else
	 	let t be the first element of s;
	 	powerSet(P. s-{t});
	 	powerSet(PU. s-{t});
	 // recursion 함수가 두 개의 집합을 매개변수로 받도록 설계해야한다는 의미.
	 // 두 번쨰 집합의 모든 부분 집합들에 첫 번째 집합을 합집합하여 출력	
	 
	 	
	 
	 */
}