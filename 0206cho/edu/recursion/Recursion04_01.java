/*
 * Recursion의 응용 - 미로 찾기 4-01
 * 
 * Recursive Thinking
 * 
 * 현재 위치에서 출구까지 가는 경로가 있으려면
 * 1) 현재 위치가 출구이거나 혹은
 * 2) 이웃한 셀들 중 하나에서 현재 위치를 지나지 않고 출구까지 가는 경로가 있거나
 * 
 * 미로 찾기 (Decision Problem)
 * 답이 yes or no인 문제 - 출발점에서 출구까지 가는 경로가 있는지 없는지
 */
package edu.recursion;

public class Recursion04_01 {
	
	/*
	public static boolean findPath(x, y){
		// 현재 위치가 출구 인지 확인
		if(x, y) is the exit
			return true;
		else
			// x, y에 인접한 셀 4개에 대해 for each
			for each neighbouring cell (x', y') of (x, y) do
				// x', y'가 통로가 아닌 경우는 생각할 필요가 없음
				// x', y'가 사람이 다닐 수 있는 통로 일 경우
				if(x', y') is on the pathway
					if findPath(x', y')
						return true; // 통로일 경우 true
			return false;
	}
	*/
	
	// 무한루프를 최대한 방지하고자 개선한 코드
	// 내가 이미 방문한 위치와 그렇지 않는 위치 구분!
	/*
	public static boolean findPath(x, y){
		// 현재 위치가 출구 인지 확인
		if(x, y) is the exit
			return true;
		else
			// 현재 위치가 방문한 위치라는 것을 마커로 표기
			mark (x, y) as a visited cell; 
			
			// 그 위치에 인접한 4개의 위치에 대해
			for each neighbouring cell (x', y') of (x, y) do
				
				// 지나갈 수 있는 통로 일 경우 + 방문하지 않은 위치일 경우
				if(x', y') is on the pathway and not visited
					if findPath(x', y')
						return true;
			return false;
	}
	 */
	
	// 최종 수정 코드
	/*
	public static boolean findPath(x, y){
		// 통로가 아니거나 방문한 위치면 바로 종료
		if(x, y) is the either on the wall or a visited cell
			return false;
		
		// x,y가 출구일 경우
		else if (x, y) is the exit
			return true;
		else
			// 출구가 아니라면 중복방문 방지
			mark (x, y) as a visited cell; 
			// 인접한 셀에 대해서
			for each neighbouring cell (x', y') of (x, y) do
				// 다시 호출
				if findPath(x', y')
					return true;
			return false;
	}
	 */
}
