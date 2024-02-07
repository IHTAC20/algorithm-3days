import sys
from itertools import combinations
input = sys.stdin.readline

n, m = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(n)]

chicken = []
home = []

#치킨집과 집의 위치를 각각 저장
for i in range(n):
    for j in range(n):
        if arr[i][j] == 1:
            home.append((i,j))
        elif arr[i][j] == 2:
            chicken.append((i,j))

answer = 9999 #min으로 최소값을 결정할 때, 큰 값으로 초기화 하자
com = list(combinations(chicken, m)) #chicken에서 m개의 원소를 뽑는 모든 경우의 수
# [([1, 2], [3, 4]), 
# ([1, 2], [5, 6]), 
# ([3, 4], [5, 6])]

for chi in com: # 첫 번째 "치킨집의 조합"부터 시작
    res = 0 # 각 집에서 가장 가까운 치킨 거리의 합을 저장할 변수
    for x1, y1 in house: # 첫 번째 집부터 시작
        street = 9999 # 각 집에서 가장 가까운 치킨 거리를 저장할 변수
        for x, y2 in chi: # 첫 번째 치킨집부터 시작
            street = min(street, abs(x1-x2) + abs(y1-y2)) # 현재 집과 각 치킨집 사이의 거리를 계산하고, 그 중 가장 가까운 치킨집 거리 선택
        res += street # 각 집에서 가장 가까운 치킨 거리를 모두 더함
    answer = min(answer, res) # 모든 집에서 가장 가까운 치킨 거리의 합 중 최솟값을 선택

print(answer)
