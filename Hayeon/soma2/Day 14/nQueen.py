import sys
input = sys.stdin.readline

n = int(input())  # 체스판 크기
chess = [0] * n
cnt = 0
def dfs(x):
    global cnt
    if x == n:
        cnt += 1
    else:
        for i in range(n):
            chess[x] = i
            possible = True
            for j in range(x): #현재 놓으려는 위치 위에랑 비교 
                if chess[x] == chess[j] or abs(x-j) == abs(chess[x] - chess[j]):
                    possible = False
                    break
            if possible:
                dfs(x + 1)    
dfs(0)
print(cnt)