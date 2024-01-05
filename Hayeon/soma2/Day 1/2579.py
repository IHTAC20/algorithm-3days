#계단오르기
import sys
input = sys.stdin.readline


def solution():
    n = int(input())
    dp = [0] * n
    arr = [int(input()) for _ in range(n)]

    if n <= 2: #계단이 2칸일 경우,다 더하는 것이 최대 #계단이 2칸일 경우,다 더하는 것이 최대
        print(sum(arr))
        return sum(arr)
    
    dp[0] = arr[0] #1번째 계단
    dp[1] = arr[0] + arr[1] #2번째 계단
    dp[2] = max(arr[1] + arr[2],  arr[0] + arr[2])  #3번째계단

    #4번째 계단부터 머지막 계단까지 계산
     #2칸 오르는 경우
     #1칸 오르는 경우 중 큰 것으로. 1칸의 경우, 계단을 3칸 연속 오를 수 없으므로
    #무조건 1칸을 오르려면, 전 단계에서 n-2계단 => n-1 계단 => n 계단 순으로만 가능함
    for i in range(3, n):
        dp[i] = max(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
    print(dp[-1])
    return dp[-1]

solution()
