import sys
sys.setrecursionlimit(10**8)
input = sys.stdin.readline

n = int(input())
x, y = map(int, input().split())

graph = [[] for _ in range(n+1)]
m = int(input())

for _ in range(m):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
visited = [False] * (n+1)


def dfs(v, cnt):
    # 현재 방문한 노드가 y라면, 촌수(cnt)를 반환
    if v == y:
        return cnt
    # 현재 노드를 방문 처리
    visited[v] = True

    # 현재 노드의 모든 인접 노드를 순회
    for i in graph[v]:
        # 아직 방문하지 않은 인접 노드에 대해 dfs를 재귀 호출
        if not visited[i]:
            answer = dfs(i, cnt + 1)
           # 만약 y를 찾았다면, 즉시 답을 리턴하여 재귀를 끝냄
            if answer != -1:  # cnt를 리턴했을 때
                return answer

    # y를 찾지 못하고 모든 경로를 탐색한 경우 -1을 반환
    return -1


print(dfs(x, 0))
