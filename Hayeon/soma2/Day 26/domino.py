import copy
from itertools import combinations

n = 1
domino = [1,2,3,4,5]
height =  [1,1,1,1,1]

def solution(n, domino, height):
    evadomino = [] # 쓰러지면 닿는 도미노
    for i in range(len(domino)-1):
        if  (domino[i] + height[i]) >= domino[i+1]:
            evadomino.append(i)
    if len(evadomino) == 0: #만약 불안요소가 없는 도미노라면
        return 0
    #n개의 인덱스조합
    comb = list(combinations(evadomino, n))
    answer = 99999
    def dfs(who):
        nonlocal answer
        domino2 = copy.deepcopy(domino)
        height2 = copy.deepcopy(height)
        who = sorted(who, reverse=True)  # 큰 인덱스부터 제거

        for i in who:
            del domino2[i]
            del height2[i]
            cnt = 0
        for j in range(len(height2)-1):
            k = j+1
            temp = 0 #1개 쓰러지는 도미노들의 불안요소 다음 도미노를 볼 때 초기회됨
            while k < len(height2) and domino2[k] <=domino2[j] + height2[j]:
                k +=1
                temp += 1
            cnt += temp
        answer = min(answer, cnt)


    for i in comb:
        dfs(i)

    return answer

print(solution(n, domino, height))
