public class level1_1 {
    public static long[] solution(int x, int n) {

        //초기화
        long[] answer = new long[n];

        //x부터 시작
        answer[0] = x;
        for(int i = 1; i < n; i++){
            // x씩 증가하는 숫자를 지나는 리스트 리턴 
            answer[i] = answer[i-1] + x;
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        int x = 3;
        int n = 2;

        solution(x, n);
    }

}