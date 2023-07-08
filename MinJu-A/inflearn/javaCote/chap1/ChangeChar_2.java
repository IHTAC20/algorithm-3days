import java.util.*;

public class ChangeChar_2 {

    public String solution(String str){
        // 정답을 담을 문자열 선언
		String answer="";

        
		for(char x : str.toCharArray()){
			if(Character.isLowerCase(x)) {
                answer += Character.toUpperCase(x);
            }
			else {
                answer += Character.toLowerCase(x);
            }

		}
		return answer;
	}

	public static void main(String[] args){
		ChangeChar_2 T = new ChangeChar_2();

        //  입력받을 변수 선언 
        Scanner sc = new Scanner(System.in);

        // 문자열에서 읽어옴
		String str= sc.next();
		System.out.print(T.solution(str));
	}
    
}
