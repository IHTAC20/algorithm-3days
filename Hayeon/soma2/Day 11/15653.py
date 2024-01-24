N, M = map(int, input().split())  # 값 입력 받기
S = []  # 리스트


def dfs(start):  # dfs 함수 생성
    if len(S) == M:  # S의 길이가 M이 되면
        print(' '.join(map(str, S)))  # S 출력
        return  # 함수 종료

    for i in range(start, N+1):  # start부터 N까지
        S.append(i)  # S에 i 추가
        dfs(i)  # dfs 함수 재귀 호출
        S.pop()  # S의 마지막 원소 제거


dfs(1)  # dfs 함수 호출
