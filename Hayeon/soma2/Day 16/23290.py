
import sys

input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
d = [list(map(int, input().split())) for _ in range(m)]

dx = ["뿡", 0, -1, -1, -1, 0, 1, 1, 1]
dy = ["뿡", -1, -1, 0, 1, 1, 1, 0, -1]
#대각선
daeX = [-1, -1, 1, 1]
daeY = [-1, 1, 1, -1]

point = [[n - 1, 0], [n - 1, 1], [n - 2, 0], [n - 2, 1]]

for dir, s in d:
    for i in range(len(point)):
        nx = (n + point[i][0] + dx[dir] * s) % n
        ny = (n + point[i][1] + dy[dir] * s) % n

        #맨처음 이동
        point[i] = [nx, ny]
        #물 추가
        arr[nx][ny] += 1
        #대각선 검사
        cnt = 0
        for i in range(4):
            x = nx + daeX[i]
            y = ny + daeY[i]
            if 0 <= x < n and 0 <= y < n and arr[x][y] > 0:
                cnt += 1
        arr[nx][ny] += cnt
        cnt = 0
    for i in range(n):
        for j in range(n):
            if arr[i][j] != point[i][j] and arr[i][j] >= 2:
                point[i][j] = arr[i][j]
                

total = 0
for i in range(n):
    for j in range(n):
        total += arr[i][j]

print(total)
