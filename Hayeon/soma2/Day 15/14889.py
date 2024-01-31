import sys

#해당 문제가 원하는 것은 n//2개로 팀을 각각 나누었을 때, 능력치가 최소인것을 구하는 것이다
#즉, 모든 멤버 구성을 조합한 후, 그 중에서 제일 작은 것을 고르는 것이다.
input = sys.stdin.readline
N = int(input())
S = [list(map(int, input().split())) for _ in range(N)] #능력치
team = [0] * N #각 사람이 어느 팀에 속하는지 표시.  team[i]가 0이면, 무소속이거나 링크
result = 10 ** 8 # result를 큰 값으로 초기화하는 이유:  이따 최소값을 갱신할 때 0 이런걸로 하면 계속 값이 0 이 선정돼서 큰 값으로 해둔다

def dfs(startCnt, idx):
    global result
    if startCnt == N // 2:  #각 팀에 멤버 구성이  반반 나뉘었다면,
        start, link = 0, 0  # start 팀, link팀
        for i in range(N):
            for j in range(N):
                if team[i] and team[j]:  # 만약 i, j 둘다 방문한거라면
                    start += S[i][j]  # 스타트팀에 배정하고 능력치 담음
                elif not team[i] and not team[j]:  # i,j 둘다 방문 안했으면
                    link += S[i][j]  # 링크 팀에 배정하고 능력치 담음
        result = min(result, abs(start - link))  # 최소값 갱신
        return
    else:
        for i in range(idx, N):
            if team[i] == 0:  # 방문 안했으면
                team[i] = 1  # 방문 체크
                dfs(startCnt + 1, i + 1)  # 재귀 돌려
                team[i] = 0  # 되돌아가

dfs(0, 0)
print(result)

# import sys
# input = sys.stdin.readline
# sys.setrecursionlimit(10**6)

# n = int(input())
# s = [list(map(int, input().split())) for _ in range(n)]
# team = [0] * n
# result = 10 ** 8

# def dfs(cnt , idx):
#     global result

#     if cnt == n //2:
#         start, link = 0,0
#         for i in range(n):
#             for j in range(n):
#                 if team[i] and team[j]:
#                     start += s[i][j]
#                 elif not team[i] and not team[j]:
#                     link += s[i][j]
#             result = min(result, abs(start - link))
#             print(result, abs(start - link))
#             return
#     else:
#         for i in range(idx, n):
#             if team[i] == 0:
#                 team[i] = 1
#                 dfs(cnt + 1, i + 1)
#                 team[i] = 0

# dfs(0,0)
# print(result)
