import sys
input = sys.stdin.readline

n = int(input())
rgb = [list(map(int, input().split())) for _ in range(n)]


#이전 집의 색상에 따라 현재 집의 색상을 결정하기 위해 이전 집의 최소 비용 + 현재 집의 비용을 구해야함. 2번째 집을 빨강으로 칠하는 비용은 (첫 번째 집을 초록 or 파랑으로 칠했을 때의 최소 비용 )+ 두 번째 집을 빨강으로 칠하는 비용
for i in range(1, n): 
    rgb[i][0] = min(rgb[i - 1][1], rgb[i - 1][2]) + rgb[i][0]
    rgb[i][1] = min(rgb[i - 1][0], rgb[i - 1][2]) + rgb[i][1]
    rgb[i][2] = min(rgb[i - 1][0], rgb[i - 1][1]) + rgb[i][2]

print(min(rgb[n - 1]))
