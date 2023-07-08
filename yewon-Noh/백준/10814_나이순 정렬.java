import java.util.*;

/**
 * `클래스 객체`를 만들어 나이와 이름을 저장한 뒤, `Comparable 클래스`를 사용하여 정렬한다.
 */
class Member implements Comparable<Member> {
    private int age;
    private String name;

    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Member o) {
        // 나이순으로 정렬(오름차순)
        return this.age - o.age;
    }
}
public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();

        ArrayList<Member> array = new ArrayList<>();
        for (int i=0; i<N; i++) {
            int age = in.nextInt();
            String name = in.next();
            array.add(new Member(age, name));
        }
        Collections.sort(array);
        for (Member m: array) System.out.println(m.getAge()+ " " + m.getName());
    }
}