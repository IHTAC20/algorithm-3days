# 15649 콤비네이션(중복x)
import sys
input = sys.stdin.readline
from itertools import combinations

n, m = map(int, input().split()) #숫자배열, 자릿수
arr = []

for i in range(1, n+1):
    arr.append(str(i))

per = list(combinations(arr, m))

# 문자열로 변환
result = [''.join(p) for p in per]
result = sorted(result)

for s in result:          
    print(' '.join(s))