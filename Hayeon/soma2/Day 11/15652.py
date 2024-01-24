import sys
input = sys.stdin.readline

N, M = map(int, input().split())  # 1부터 N까지 중에서 M개를 고른 수열
S = []  # 리스트


def dfs():
    if len(S) == M:
        print(' '.join(map(str, S)))
        return
    for i in range(1, N+1):
        if S and S[i-1] < i:
            S.append(i+1)
        else:
            S.append(i)
        dfs()
        S.pop()


dfs()
