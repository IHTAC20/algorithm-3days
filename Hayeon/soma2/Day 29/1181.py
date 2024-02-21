# 길이가 짧은 것부터
# 길이가 같으면 사전 순으로

import sys
input = sys.stdin.readline

n = int(input())
arr = list(input().rstrip() for _ in range(n))
arr= list(set(arr))
arr.sort(key=lambda x: (len(x), x) )
for i in arr:
    print(i)