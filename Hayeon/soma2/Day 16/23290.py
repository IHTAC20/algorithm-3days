import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]
magic = [list(map(int, input().split())) for _ in range(m)]

dx = [0, 0, -1, -1, -1, 0, 1, 1, 1]
dy = [0, -1, -1, 0, 1, 1, 1, 0, -1]
#대각선
daeX = [-1, -1, 1, 1]
daeY = [-1, 1, 1, -1]

point = [[n - 1, 0], [n - 1, 1], [n - 2, 0], [n - 2, 1]]

def first():
    for j in range(len(point)):
        d = magic[i][0] 
        c = magic[i][1] 
        point[j][0] = (point[j][0] + (dx[d] * c)) % n
        point[j][1] = (point[j][1] + (dy[d] * c)) % n

def second():
    for x, y in point:
        arr[x][y] += 1
        cnt = 0
        #대각선 검사
        for p in range(4):
            nx = daeX[p] + x
            ny = daeY[p] + y
            if 0 <= nx and nx < n and 0 <= ny and ny < n and arr[nx][ny] >=1:
               cnt += 1 
                
        arr[x][y] += cnt
        cnt = 0
        
def third(): 
    v = [[0]*n for _ in range(n)]#기존 구름의 위치를 기록
    for i, j in point:
        v[i][j] = 1
    new = [] #새로운 구름의 위치
    for i in range(n):
        for j in range(n):
            if not v[i][j] and arr[i][j] >=2: 
                arr[i][j] -= 2
                new.append([i, j])
    return new

for i in range(m):
    first()
    second()
    point = third()

result = 0
for i in range(n):
    for j in range(n):
        result += arr[i][j]

print(result)
print(arr)
