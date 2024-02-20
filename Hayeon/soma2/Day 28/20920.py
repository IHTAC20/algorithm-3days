
import sys
input = sys.stdin.readline

t,n = map(int, input().split())
dic = {}
for _ in range(t):
    a = input().rstrip()
    if len(a) < n:
        continue
    if a in dic:
        dic[a] +=  1
    else:
        dic[a] = 1

s = sorted(dic.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))

for i in s:
    print(i[0])    