
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

T = int(input())
for _ in range(T):
    M,N, K = map(int, input().split())
    arr = [[0] * M for _ in range(N)]
    for _ in range(K):
        x, y = map(int, input().split())
        arr[y][x] = 1
    dx = [-1, 1, 0, 0]
    dy = [0,0,-1,1]

    def dfs(y,x):
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if ny < N and ny >=0 and nx < M and nx >= 0 and arr[ny][nx] ==1:
  
                arr[ny][nx] = 0
                dfs(ny,nx)
    cnt = 0
    for i in range(N):
        for j in range(M):
            if arr[i][j] == 1:
                dfs(i,j)
                cnt +=1

    print(cnt)
