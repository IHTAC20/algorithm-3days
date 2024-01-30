#13458
import sys
input = sys.stdin.readline

n = int(input()) 
arr = list(map(int, input().split()))

b, c = map(int, input().split())
cnt = 0
for i in arr:
    i -= b
    cnt += 1
    if i > 0:
        if i % c:
            cnt += (i // c) + 1
        else:
            cnt += (i // c)    
print(cnt)

        