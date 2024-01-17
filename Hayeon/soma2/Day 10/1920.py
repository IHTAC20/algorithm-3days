import sys
input = sys.stdin.readline

n = int(input())
arr1 = set(map(int, input().split()))

m = int(input())
arr2 = list(map(int, input().split()))

result = []

for i in arr2:
    if i in arr1:
        result.append(1)
    
    else:
        result.append(0)

for j in result:
    print(j)
