import math
from collections import deque
def solution(progresses, speeds):
    answer = []
    q = deque()
    
    for i in range(len(speeds)):
        day = math.ceil((100 - progresses[i]) / speeds[i]) # 2.55일 -> 3일로 계산
        q.append(day)
    
    while q: #뒤에 쭉 보면서 작은 거 있을 때까지 반복 
        before = q.popleft()
        cnt = 1
        while q:
            now = q.popleft()
            if before >= now: #5,10
                cnt += 1
            else: 
                q.appendleft(now)
                break
        answer.append(cnt)
    return answer            