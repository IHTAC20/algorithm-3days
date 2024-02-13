import sys
input = sys.stdin.readline
arr = []
n = int(input())

for _ in range(n):
    a, b,c,d = map(str, input().split())
    arr.append([a,int(b),int(c),int(d)])

arr = sorted(arr, key=lambda x:(x[3],x[2],[1]))
min_res = arr[0][0]
max_res = arr[-1][0]
print(max_res)
print(min_res)