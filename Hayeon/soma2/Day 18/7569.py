import sys
input = sys.stdin.readline
from collections import deque

m,n,h = map(int, input().split())
arr = [[list(map(int, input().split())) for _ in range(n)] for _ in range(h)]

#위 아래 왼쪽 오른쪽 앞 뒤 
dx = [0, 0, 0, 0, -1, 1]
dy = [0, 0, -1, 1, 0, 0]
dh = [-1, 1, 0, 0, 0, 0]
q = deque()

for he in range(h):
    for i in range(n):
        for j in range(m):
            if arr[he][i][j] == 1:
                q.append([he,i,j])
        
def bfs():  
    while q:
        he, x, y = q.popleft()
        for i in range(6):
            nh = dh[i] + he
            nx = dx[i] + x
            ny = dy[i] + y
            if  0 <= nx < n and 0 <= ny < m and 0 <= nh < h:
                if arr[nh][nx][ny] == 0 :
                    arr[nh][nx][ny] = arr[he][x][y] + 1
                    q.append([nh, nx, ny])

bfs()
result = -3

for h in arr:
    for i in h:
        for j in i:
            if j == 0:
                print(-1)
                exit(0)
            result = max(result, j)

if result == 1:
    print(0)
else:
    print(result-1)    
