import sys
from collections import deque
input = sys.stdin.readline

F, S, G, U, D = map(int, input().split())


def bfs():
    visited = [0] * (F + 1)
    visited[S] = 1
    q = deque([(S, 0)])

    while q:
        now, cnt = q.popleft()
        if now == G:
            return cnt

    # 위로 이동
        if U != 0 and now + U <= F and not visited[now + U]:
            visited[now + U] = 1
            q.append((now + U, cnt + 1))
    # 아래로 이동
        if D != 0 and now - D >= 1 and not visited[now - D]:
            visited[now - D] = 1
            q.append((now - D, cnt + 1))

    return "use the stairs"


print(bfs())
