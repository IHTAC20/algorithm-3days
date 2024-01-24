import sys
input = sys.stdin.readline

N=int(input())
arr=list(map(int,input().split()))
dp=[1]*N 
for now in range(0,N):
    for bf in range(now): #now보다 인덱스가 작은 것들 비교 만약 지금 비교할 인덱스가 2라면 0번째 수~ 2번째수 비교
        if arr[now]>arr[bf]:  #now > bf라면 (순열 형태라면)
            dp[now]=max(dp[now],dp[bf]+1) # now 위치 dp와 bf인덱스 + 1 값 중 큰 것을 dp[now]에 넣어줌

print(max(dp))
