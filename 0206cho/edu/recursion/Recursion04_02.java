/*
 * Recursion의 응용 - 미로 찾기 4-02
 * 
 * Class Maze
 * -> true
 */
package edu.recursion;

public class Recursion04_02 {
	private static int N = 8;
	
	// 통로 : 0, 벽 : 1
	private static int [][] maze ={
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
	};
	
	// 각 셀마다 고유 색 표기
	private static final int PATHWAY_COLOUR = 0; // white - 통로
	private static final int WALL_COLOUR = 1;  	// blue - 벽
	private static final int BLOCKED_COLOUR = 2;	// red - 방문했지만 길이 없음
	private static final int PATH_COLOUR = 3;	// green - 방문했지만 아직까진 출구가 있는지 없는지 판단이 안된 셀
	// 방문후 일단 녹색으로 칠하고 갔는데 길이 없으면 주황으로 칠함
	 
	// PATH_COLOR : visited이며 아직 출구로 가는 경로가 될 가능성이 있는 cell
	//BLOCED_COLOR : visited이며 출구까지의 경로상에 있지 않음이 밝혀진 cell

	// 위치 x,y에 대해 출구까지 있는 경로가 있는지 검색하는 셀
	public static boolean findMazePath(int x, int y){
		// 좌표가 유효한 범위인지 0~n-1
		if(x<0 || y<0 || x>=N || y>=N)
			return false; // 유효 범위 아니면 false
		
		// 통로가 아닐 경우 false - green or red or blue
		else if (maze[x][y] != PATHWAY_COLOUR)
			return false; 
		
		// 출구 일 경우
		else if (x==N-1 && y==N-1) {
			// 방문한 위치이므로 녹색으로 칠하고 true리턴
			maze[x][y] = PATH_COLOUR;
			return true;
		}
		
		else {
			// 방문 했으므로 일단 녹색으로 칠함
			maze[x][y] = PATH_COLOUR;
			
			// 인접한 4개에 대해서 다시 함수 실행
			if(findMazePath(x-1, y) || findMazePath(x, y+1)
					|| findMazePath(x+1, y) || findMazePath(x, y-1)){
				return true;
			}
			maze[x][y] = BLOCKED_COLOUR; // dead end
			return false;
		}
	}
	
	public static void main(String[] args) {
		boolean result = findMazePath(0, 0); // 입구
		System.out.println(result);
	}
}
