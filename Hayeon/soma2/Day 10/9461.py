# #9461
import sys
input = sys.stdin.readline


n = int(input())

for _ in range(n):
    m = int(input())
    dp = [1, 1, 1, 2]
    for j in range(4, m):
        dp.append(dp[j-2] + dp[j-3])
    print(dp[m-1])
