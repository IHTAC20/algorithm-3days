

import java.util.Scanner;

//  설명

// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

// 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.


// 입력
// 첫 줄에 문자열이 주어지고, 두 번째 줄에 문자가 주어진다.

// 문자열은 영어 알파벳으로만 구성되어 있습니다.




public class FindChar_1 {

    public int solution(String strAnswer, char charAnswer){

        // 개수를 구하기
        int intAnswer = 0;
        
        // 문자가 대문자일지 소문자일지 모르니까 통일
        strAnswer = strAnswer.toUpperCase();
        charAnswer = Character.toUpperCase(charAnswer);
        System.out.println(strAnswer);

        // strAnswer을 돌면서 c랑 같으면 answer 증가
        for(char c : strAnswer.toCharArray()){
			if(c == charAnswer) intAnswer++;
		}

        return intAnswer;
    }

    public static void main(String[] args){

        // 클래스 객체 생성
        FindChar_1 findChar_1 = new FindChar_1();

        // 콘솔 입출력용 스캐너 객체 생성
        Scanner scStr =new Scanner(System.in);

        // 문자열을 읽음
        String str = scStr.next();

        // 입력된 문자열 읽고 거기서 char의(n)번째 문자열 읽음
        char ch = scStr.next().charAt(0);
        
        // 함수 호출
        findChar_1.solution(str, ch);
    }
    
}
