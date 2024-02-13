import sys
input = sys.stdin.readline

n = int(input())
arr =  [list(input()) for _ in range(n)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]

def dfs():
    max_x = max_y = 1
    for i in range(n):
        cnt1 = cnt2 = 1
        for j in range(1, n):
            if arr[i][j] == arr[i][j-1]:
                cnt1 += 1
            else:
                max_x = max(max_x, cnt1)
                cnt1 = 1
            if arr[j][i] == arr[j-1][i]:
                cnt2 += 1
            else:
                max_y = max(max_y, cnt2)
                cnt2 = 1
        max_x = max(max_x, cnt1)
        max_y = max(max_y, cnt2)
    return max(max_x, max_y)

ans = 1
for x in range(n):
    for y in range(n):
        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y
            if 0 <= nx < n and 0 <= ny < n:
                if arr[nx][ny] != arr[x][y]:
                    arr[nx][ny], arr[x][y] = arr[x][y], arr[nx][ny]
                    ans = max(ans, dfs())
                    arr[nx][ny], arr[x][y] = arr[x][y], arr[nx][ny]

print(ans)
