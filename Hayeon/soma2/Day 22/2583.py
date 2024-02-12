#BFS
import sys
input = sys.stdin.readline
from collections import deque
m, n, k = map(int, input().split())
arr = [[0] * m for _ in range(n)]


for _ in range(k):
    x1, y1, x2, y2 = map(int, input().split())
    for i in range(x1, x2):     
        for j in range(y1, y2): 
            arr[i][j] = 1

answer = []
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]
q = deque()
cnt = 0

def bfs(x, y):
    global cnt
    q.append([x, y])
    arr[x][y] = 1  # 방문 표시

    while q:
        x1, y1 = q.popleft()
        for i in range(4):
            nx = x1 + dx[i]
            ny = y1 + dy[i]

            if 0 <= nx < n and 0 <= ny < m and arr[nx][ny] == 0:
                q.append([nx, ny])
                arr[nx][ny] = 1  # 방문 표시
                cnt += 1

for i in range(n):
    for j in range(m):
        if arr[i][j] == 0:
            cnt = 1
            bfs(i, j)
            answer.append(cnt)

answer.sort()
print(len(answer))

for i in answer:
    print(i, end=" ")

#DFS
# import sys
# sys.setrecursionlimit(10**6)
# input = sys.stdin.readline

# m, n, k = map(int, input().split())
# arr = [[0] * m for _ in range(n)]
# #좌표 생성
# for _ in range(k):
#     x1, y1, x2, y2 = map(int, input().split())
#     for i in range(x1, x2):     # 왼쪽 위 꼭짓점부터
#         for j in range(y1, y2): # 오른쪽 아래 꼭짓점까지
#             arr[i][j] = 1

# dx = [-1, 1, 0, 0]
# dy = [0, 0, -1, 1]

# def dfs(x, y):
#     arr[x][y] = 1  # 방문 표시
#     cnt = 1
    
#     for i in range(4):
#         nx = x + dx[i]
#         ny = y + dy[i]

#         if 0 <= nx < n and 0 <= ny < m and arr[nx][ny] == 0:
#             cnt += dfs(nx, ny) #return되는 dfs값을 더해준다 
#     return cnt

# answer = []

# for i in range(n):
#     for j in range(m):
#         if arr[i][j] == 0:
#             answer.append(dfs(i, j))

# answer.sort()
# print(len(answer))
# for i in answer:
#     print(i, end=" ")
