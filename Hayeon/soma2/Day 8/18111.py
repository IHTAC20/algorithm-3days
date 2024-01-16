import sys
input = sys.stdin.readline

N, M , B = map(int, input().split())
ground = []


#땅의 높이 1차원 리스트로 받기
for _ in range(N):
    ground += list(map(int, input().split()))

#최소높이~ 최대 높이까지 반복문을 돌며 해당 높이를 만드는 데 걸린 시간을 구할 것임
min = min(ground)
max = max(ground)
all = []  #모든 높이 케이스를 담을 배열 [[높이, 걸리는 시간], [높이, 걸리는 시간]] 

#만약  N, M, G가 0 1 99 면  0~1까지의 높이를 살펴볼이것임 
for now in range(min, max + 1): #now는 만들고자 하는 높이
    inven = B #현재 인벤토리 상태 99
    time = 0 # 걸리는시간 초기화
    
    for i in ground:  #ground 배열을 돌면서 각각 땅이 시간이 얼마나 걸리는 지 확인해볼 것임
        if now < i: #만약 땅의 높이가 더 높다면
            time += (i - now) * 1 #1초 * (목표 높이 - 현재 높이) 
            inven -= (i - now) #인벤토리에서 땅을 꺼냄
        elif now > i: # 만약 땅의 높이가 더 낮다면
            time += (now - i) * 2 # 2초 * (현재 높이 - 목표 높이)
            inven += (now - i) #인벤토리에 땅을 집어넣음 
    if inven >= 0: #케이스를 다 돌았는데 0 이상이면 (음수인 경우의 수를 제거하기 위함)
        all.append([time, now]) #케이스에으 넣음

#시간을 오름차순하고, 만약 같은 시간 케이스가 여러개면 땅의 높이가 가장 높은 것을 출력
result = sorted(all, key = lambda x: (x[0], -x[1]))[0]
print(*result)