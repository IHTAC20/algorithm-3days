import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())  # 세로, 가로
r, c, d = map(int, input().split())  # (r,c,d) 방향
arr = [list(map(int, input().split())) for _ in range(n)]
cnt = 0

# 북, 동, 남, 서
dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]


def dfs(r, c, d):
    global cnt
    if arr[r][c] == 0:  # 청소가능하다면
        arr[r][c] = 2  # 청소처리
        cnt += 1 #카운트 

    for _ in range(4):
        nd = (d+3) % 4  # 왼쪽 회전
        nx = dx[nd] + r
        ny = dy[nd] + c

        if arr[nx][ny] == 0:
            dfs(nx, ny, nd)
            return
        d = nd    
    #후진값 구하기     
    backd = (d+2) % 4  # 후진값을 구하기 위한 임의의 backd!
    nx = dx[backd] + r
    ny = dy[backd] + c

    if arr[nx][ny] == 1:
        return
    dfs(nx, ny, d)  # 후진한 상태에서 다시 dfs! backd는 후진후의 위치 구하기 위한 것이므로, 원래 방향인 d를 넣어dfs를 호출한다.
    
dfs(r, c, d)
print(cnt)