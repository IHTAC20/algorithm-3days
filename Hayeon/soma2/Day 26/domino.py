import copy
from itertools import combinations

n = 2
domino = [1,5,9, 13,15, 17,18]
height = [1,11,6, 2,9,  1, 1]

def solution(n, domino, height):

    evadomino = [] # 쓰러지면 닿는 도미노
    for i in range(len(domino)-1):
        if  (domino[i] + height[i]) >= domino[i+1]:
            evadomino.append(i)
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
        for j in range(len(domino2)-1):
            k = j + 1 #다음 도미노 
            #k번째 도미노가 j번째 도미노가 도달할 수 있는 범위 내에 있고, 
            # 동시에 k가 domino2 리스트의 범위 내에 있는 동안 반복
            while k < len(domino2) and domino2[k] <= domino2[j] + height2[j]:
                k += 1
            cnt += k - j - 1
        answer = min(answer, cnt)

    for i in comb:
        dfs(i)

    return answer

print(solution(n, domino, height))
