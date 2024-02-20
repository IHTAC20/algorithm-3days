# # 처음 생각했던 알고리즘 {인덱스:우선순위로 묶기}
# from collections import deque
# import sys
# input = sys.stdin.readline

# n = int(input())

# for _ in range(n):
#     a, b = map(int, input().split())  # 문서의 길이와 찾을 문서의 인덱스
#     arr = list(map(int, input().split()))
#     dic = {}

# for i in range(a):
#     dic[i] = arr[i]  # {인덱스: 우선순위}

# dic = sorted(dic.items(), key=lambda x: x[1], reverse=True)

# dicList = [item[0] for item in dic]
# print(dicList.index(b) + 1)

# 1966번
import sys
input = sys.stdin.readline
from collections import deque

n = int(input())
for _ in range(n):
    a, b = map(int, input().split())  # 종이 수, 원하는 인덱

    q = deque(list(map(int, input().split())))
    cnt = 0

    while q:
        big = max(q)
        now = q.popleft()  # 앞에 요소 꺼내고
        if now == big:  # 만약 꺼낸 게 가장 큰 값이면
            cnt += 1  # 출력하고 몇번째 출력인지 기록
            if (b == 0):  # 출력하는 게 내가 원하는 인덱스
                print(cnt)
                break  # 종료
            else:
                b -= 1  # b가 아니면 앞에꺼를 빼고 얘를 한 칸 땡긴다.

        else:  # 큰 값이 아니라면
            q.append(now)  # 다시 뒤로 보낸다
            if (b == 0):  # 만약 b가 0이지만 제일 큰 게 아니라면
                b = len(q) - 1  # 인덱스를 다시 맨 뒤로 보낸다
            else:
                b -= 1  # b를 한 칸 땡긴다.
