#백준 골드 5 맥주 마시면서 걸어가기
import sys
input = sys.stdin.readline
from collections import deque
t = int(input())

for _ in range(t): #테스트 케이스
    n = int(input()) #편의점 수
    home = list(map(int, input().split()))
    stores = [list(map(int, input().split())) for _ in range(n)]
    rock = list(map(int, input().split()))
    v = [False for _ in range(n+1)] #편의점 방문 여부
     # 맥주 20병 = 1000m이므로  1000m를 기준으로 갈 수 있는지 없는지 확인


    def distance(x1, y1, x2, y2):
        dis = abs(x1-x2) + abs(y1-y2)
        return dis

    def bfs(home):
        q = deque()
        q.append(home)

        while q:
            x,y = q.popleft()
            dis = distance(x, y, rock[0], rock[1])
            if dis <= 1000:
                print("happy")
                return
            for i in range(n):
                dis = distance(x, y, stores[i][0], stores[i][1])
                if not v[i] and dis <= 1000:
                    v[i] = True
                    q.append(stores[i])

        print("sad")
        return
    bfs(home)