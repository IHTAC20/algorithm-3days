import sys
sys.setrecursionlimit(10**8)
input = sys.stdin.readline

n = int(input())
arr = []

for _ in range(n):
    m, p = map(int,input().split())
    arr.append((m, p))

def dfs(i, money):
    if i > n: #날짜가 지난 경우
        return 0
    if i == n: #막날
        return money
    work, noWork = 0, 0
    if i + arr[i][0] <= n:  #현재 날짜 + 걸리는 기간 Ti
        work = dfs((i + arr[i][0]), (money + arr[i][1]))  # 상담을 진행하는 경우 다음 날짜랑 돈 더하기
    noWork = dfs(i + 1, money)  # 상담 못하면
    return max(work, noWork)  # 둘 중 더 큰 거

print(dfs(0, 0))  # 첫 날부터
