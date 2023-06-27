import java.util.*;

public class NumSpilt {
    public int solution(String s){
		
		String answer="";
		for(char x : s.toCharArray()){
	
			if(Character.isDigit(x)) answer+=x;
		}
		return Integer.parseInt(answer);
	}

	public static void main(String[] args){
		NumSpilt T = new NumSpilt();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(T.solution(str));
	}
    
}
