import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))
a,b,c,d = map(int, input().split())

max_res = -9999999999
min_res = 999999999

def dfs(a,b,c,d,i,res):
    global max_res
    global min_res
    if i == n:
        max_res = max(max_res, res)
        min_res = min(min_res, res)
    if a > 0:
        dfs(a-1,b,c,d,i+1,res+arr[i])

    if b > 0:
        dfs(a,b-1,c,d,i+1, res-arr[i])

    if c > 0:
        dfs(a,b,c-1,d,i+1,res*arr[i])

    if d > 0:
        dfs(a, b, c, d-1, i+1, int(res // arr[i]))

    
dfs(a,b,c,d,1,arr[0])
print(max_res)
print(min_res)