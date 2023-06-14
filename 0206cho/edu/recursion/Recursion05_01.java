/*
 * Recursion의 응용 - Counting Cells in a Blob 5-01
 * Blob : 서로 연결된 image pixel들의 집합
 *
 * 각 픽셀은 background pixel이거나 혹은 image pixel
 * 상하좌우 및 대각방향으로도 연결된 것으로 간주
 * 
 * 입력 :
 * - N * N 크기의 2차원 그리드
 * - 하나의 좌표 (x, y)
 * 
 * 출력 :
 * - 픽셀 (x,y)가 포함된 blob의 크기,
 * - (x,y)가 어떤 blob에도 속하지 않는 경우에는 0
 * 
 * 현재 픽셀이 이 속한 blob의 크기를 카운트하려면
 * 	현재 픽셀이 image color가 아니라면 0을 반환
 * 	현재 픽셀이 image color라면 
 * 		먼저 현재 픽셀을 카운트 (count = 1)
 * 		현재 픽셀이 중복 카운트되는 것을 방지하기 위해 다른색으로 칠함
 * 		현재 픽셀이 이웃한 모든 픽셀들에 대해서
 * 			그 픽셀이 속한 blob의 크기를 카운트하여 카운트에 더해줌
 * 		카운터를 반환
 * 
 * 
 */
package edu.recursion;

public class Recursion05_01 {
	/*
	 // 입력으로 하나의 x,y 좌표를 받음
	 Algorithm for countCells(x, y)
	 
	 // 픽셀이 유효한 값이 아닐 경우 ex) x<0. y<0. x>N, y<N
	 if the pixel (x, y) is outside the grid
	 	the result is 0;
	 
	 // x, y가 이미지 픽셀이 아니거나, 이미 카운트 된 픽셀일 경우
	 else if pixel (x, y) is not an image pixel or already counted
	 	the result is 0;
	 	
	 // 이미지 픽셀 + 이미 카운트 된 픽셀 X
	 else
	 	// 카운트를 하기 위해 빨간색으로 칠하고
	 	set the colour of the pixel (x, y) to a red colour; // 이미 카운트 되었음을 표시
	 	// 카운트 + 1, 인접한 4개 픽셀에 대해서도 진행 
	 	the result is 1 plus the number of cells in each piece of
	 		the blob that includes a nearest neighbour;
	 
	 */
	
}