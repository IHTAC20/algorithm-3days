import sys

sys.setrecursionlimit(10**8)
input = sys.stdin.readline

#정점
n = int(input())
#간선
m = int(input())

graph = [[] for _ in range(n + 1)]
visited = [0] * (n + 1)

for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

visited[1] = 1

def dfs(v):
    visited[v] = 1
    for i in graph[v]:
        if not visited[i]:
            dfs(i)

dfs(1)
print(sum(visited) - 1)