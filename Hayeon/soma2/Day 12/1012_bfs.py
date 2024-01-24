import sys
from collections import deque
input = sys.stdin.readline

t= int(input())

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

for _ in range(t):
    M, N, K = map(int, input().split()) #세로 세로 배추 갯수
    arr = [[0] * M for _ in range(N)] #빈칸 만들기 [0] * M 을 N줄 만들기

    for _ in range(K): #배추 수만큼 배추의 좌표 입력
        x, y = map(int, input().split())
        arr[x][y] = 1
    
    def bfs(x, y):
        q = deque()
        q.append((x, y))

        while q:
            x, y = q.popleft()
            for i in range(4):
                nx = x + dx[i]
                ny = y + dy[i]
                if nx >= 0 and nx <= M and ny >= 0 and ny <= N and arr[nx][ny] == 1: #범위 안이면
                    arr[nx][ny] == 0
                    q.append((nx, ny))
    cnt = 0
    ## for문으로 안을 확인다. 
    #  [1, 0, 0, 0, 0, 0, 0, 0]
    #  [1, 1, 0, 0, 0, 0, 0, 0]
    #  [0, 0, 0, 0, 1, 0, 0, 0]
    #  [0, 0, 0, 0, 1, 0, 0, 0] 
    #  [0, 0, 1, 1, 0, 1, 0, 0]
    #  [0, 0, 0, 0, 0, 0, 0, 0]+
    #  [0, 0, 0, 0, 0, 0, 0, 0]
    #  [0, 0, 0, 0, 1, 1, 1, 0]
    #  [0, 0, 0, 0, 1, 1, 1, 0]
    #  [0, 0, 0, 0, 1, 1, 1, 0]
    for i in range(N): #세로 안에
        for j in range(M): #가로
            if arr[i][j] == 1:
                cnt += 1
                bfs(i, j)

    print(cnt)        