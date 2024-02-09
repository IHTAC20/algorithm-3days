import sys
input = sys.stdin.readline
n = int(input())
arr =[]

for i in range(n):
    i = int(input())
    if i == 0 and len(arr) > 0:
        arr.pop(i-1)
    else:
        arr.append(i)
        

print(sum(arr))