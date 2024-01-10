import sys
input = sys.stdin.readline

arr = []
for _ in range(9):
    arr.append(input())
answer = max(arr)
print(answer, arr.index(answer)+1)
