import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**8)

n = int(input())
arr = [list(map(str, input().rstrip())) for _ in range(n)]

v = [[False] * n for _ in range(n)]

dx = [-1,1,0,0]
dy = [0,0,-1,1]
cnt1, cnt2 = 0,0 #no색약, 색약

def dfs(x,y):
    c = arr[x][y]
    v[x][y] = True
    #대각선 검사 
    for i in range(4):
       nx = dx[i] + x
       ny = dy[i] + y
       if 0 <= nx < n and 0 <= ny < n and arr[nx][ny] == c and v[nx][ny] == False:
           dfs(nx,ny)

#색약 아닌 자 카운트
for i in range(n):
    for j in range(n):
        if v[i][j] == False:
            dfs(i,j)
            cnt1 +=1


#색약인 검사를 위해 다시 초기화 
v = [[False] * n for _ in range(n)] 

for i in range(n):
    for j in range(n):
        if arr[i][j] == "R":
            arr[i][j] = "G"
#색약인 사람 카운트 
for i in range(n):
    for j in range(n):
        if v[i][j] == False:
            dfs(i,j)
            cnt2 +=1

print(cnt1, cnt2)