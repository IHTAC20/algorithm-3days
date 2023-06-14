/*
 * Recursion의 응용 - Counting Cells in a Blob 5-02
 * -> 18
 */
package edu.recursion;

public class Recursion05_02 {
	private static int N = 8;
	
	private static int [][] grid ={
			{1, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	private static final int BACKGROUND_COLOR = 0; 
	private static final int IMAGE_COLOR = 1; 
	private static final int ALREADY_COUNT = 2; // 이미 카운트 된 표기

	public static int countCells(int x, int y){
		// 유효하지 않는 범위
		if(x<0 || y<0 || x>=N || y>=N)
			return 0; 
		
		// 이미지 컬러가 아닐 경우
		else if (grid[x][y] != IMAGE_COLOR)
			return 0; 
		
		
		else {
			grid[x][y] = ALREADY_COUNT;
			
			// 인접한 8개의 좌표
			return 1 + countCells(x-1, y+1) + countCells(x, y+1) 
					 + countCells(x+1, y+1) + countCells(x-1, y)
					 + countCells(x+1, y) + countCells(x-1, y-1)
					 + countCells(x, y-1) + countCells(x+1, y-1);
		}
	}
	
	public static void main(String[] args) {
		int result = countCells(0, 0); 
		System.out.println(result);
	}
}