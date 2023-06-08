### 6월 2주차

#### 1일차: [백준 9095번 - 1, 2, 3 더하기](https://www.acmicpc.net/problem/9095)

입력한 수(`n`)에 따른 방법 수를 계산하면 규칙을 찾을 수 있다.

n > 4 일때 방법의 수는 `fn[n] = fn[n-1] + fn[n-2] + fn[n-3]`

> 즉, n이 1부터 11일때까지의 값을 미리 fn[ ]에 저장해두고 `n이 입력되면 fn[n]의 값을 돌려주면 된다.`

|n|1|2|3|4|5|...|
|:--|:--|:--|:--|:--|:--|:--|
||1|1+1 <br> 2|1+1+1, 1+2 <br> 2+1 <br> 3|1+1+1+1, 1+1+2, 1+2+1, 1+3 <br> 2+1+1, 2+2 <br> 3+1|1+1+1+1, 1+1+1+2, 1+1+2+1, 1+2+1+1, 1+1+3, 1+3+1 <br> 2+1+1+1, 2+2+1, 2+1+2, 2+3 <br> 3+1+1, 3+2|...|
|방법 수|1|2|4|7|11|...|

<br>

#### 2일차: [백준 10814 - 나이순 정렬](https://www.acmicpc.net/problem/10814)

구현하는 방법은 두가지가 있다.
1. `배열`에 나이와 이름을 저장한 뒤, `Arrays.sort()에 Comparator의 compare 메소드`를 구현하여 정렬

```java
String[][] array = new String[N][2];
for (int i=0; i<N; i++) {
    array[i][0] = in.next();
    array[i][1] = in.next();
}

// 나이순으로 정렬(오름차순)
Arrays.sort(array, new Comparator<String[]>() {
    @Override
    public int compare(String[] o1, String[] o2) {
        return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
    }
});
```

2. `클래스 객체`를 만들어 나이와 이름을 저장한 뒤, `Comparable 클래스`를 사용하여 정렬

```java
class Member implements Comparable<Member> {
    private int age;
    private String name;

    @Override
    public int compareTo(Member o) {
        // 나이순으로 정렬(오름차순)
        return this.age - o.age;
    }
}
```