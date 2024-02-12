#dfs

import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6 )
n = int(input())
arr = []

# 그래프 만들기
for i in range(n):
    m = list(map(int, input().split()))
    arr.append(m)

max_v = 0

for i in range(n):
    for j in range(n):
        max_v = max(max_v, arr[i][j])

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def dfs(x, y, h): 
    visited[x][y] = True
    for i in range(4):
        nx = dx[i] + x
        ny = dy[i] + y

        if 0 <= nx < n and 0 <=ny < n and arr[nx][ny] > h and visited[nx][ny] == False:
            visited[nx][ny] = True
            dfs(nx,ny,h)
      
answer = []

#각 높이에 대해 새로운 탐색을  시작할 때 visited를 재설정해야된다.  
#for 문바깥으로 이동해야함 
for h in range(max_v):
    visited = [[False] * n for _ in range(n)]
    cnt = 0 #cnt를 방문여부와 함께 초기화 할 것
    for x in range(n):
        for y in range(n):
            if arr[x][y] > h and visited[x][y] == False:
                dfs(x,y,h)
                cnt +=1
    answer.append(cnt)
print(max(answer))

#bfs
import sys
input = sys.stdin.readline
from collections import deque
n = int(input())
arr = []

# 그래프 만들기
for i in range(n):
    m = list(map(int, input().split()))
    arr.append(m)

max_v = 0

for i in range(n):
    for j in range(n):
        max_v = max(max_v, arr[i][j])

dx = [-1,1,0,0]
dy = [0,0,-1,1]

q = deque()
def bfs(x, y, h):
    q.append((x,y,h))
    
    while q:
        x,y,h = q.popleft()
        visited[x][y] = True
        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y

            if 0 <= nx < n and 0 <=ny < n and arr[nx][ny] > h and visited[nx][ny] == False:
                visited[nx][ny] = True
                q.append((nx,ny,h))
      
answer = []

#각 높이에 대해 새로운 탐색을  시작할 때 visited를 재설정해야된다.  
#for 문바깥으로 이동해야함 
for h in range(max_v):
    visited = [[False] * n for _ in range(n)]
    cnt = 0 #cnt를 방문여부와 함께 초기화 할 것
    for x in range(n):
        for y in range(n):
            if arr[x][y] > h and visited[x][y] == False:
                bfs(x,y,h)
                cnt +=1
    answer.append(cnt)
print(max(answer))

