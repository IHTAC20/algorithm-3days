import sys
input = sys.stdin.readline
from collections import deque
import copy
n,m = map(int, input().split()) # 세로줄 가로줄
arr = []
dx = [-1,1,0,0]
dy = [0,0,-1,1]
answer = 0

#그래프만들기
for _ in range(n):
    a = list(map(int, input().split()))
    arr.append(a)

#벽세우기 
def setUP(wallCnt):
    if wallCnt == 3 :
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                arr[i][j] = 1 #0인 경우에만 벽 세우기
                
                setUP(wallCnt + 1)
                arr[i][j] = 0 # 벽 원상 복구 
q = deque()

#바이러스 뿌리고 영역 검사
def bfs():
    copyarr = copy.deepcopy(arr) #얉은 복사로 하면 원본도 바뀌어서 깊은 복사 해줘야함
    global answer
    q = deque()
    for i in range(n):
        for j in range(m):
            if copyarr[i][j] == 2:
                q.append([i,j])
    while q:
        x,y = q.popleft()
        for i in range(4):
            nx = dx[i] + x 
            ny = dy[i] + y
            if 0 <= nx < n and 0 <= ny <m : 
                if copyarr[nx][ny] == 0:
                    copyarr[nx][ny] = 2
                    q.append([nx,ny])

    #안전영역수 세기 
    cnt = 0
    for i in range(n):
        for j in range(m):
            if copyarr[i][j] == 0:
                cnt +=1
    answer = max(answer, cnt)  

setUP(0)
print(answer)
