import sys
from collections import deque
input = sys.stdin.readline

n, m = map(int, input().split())  
arr = [list(map(int, input().split())) for _ in range(n)]  
# x축 방향 (동, 서, 남, 북)
dx = [0, 0, -1, 1]  
dy = [1, -1, 0, 0]  
year = 0  
visited = [[False]*m for _ in range(n)] 

def bfs(x, y):  # 빙산이 몇 덩어리인지 확인하는 함수
    q = deque([(x, y)])  
    visited[x][y] = True 
    seaArr = []  # 바다를 담음

    while q:  # 큐가 빌 때까지 반복
        x, y = q.popleft()  
        sea = 0  
        for i in range(4):  # 주변을 탐색
            nx, ny = x + dx[i], y + dy[i]  # 다음 위치
            if 0 <= nx < n and 0 <= ny < m: 
                if arr[nx][ny] == 0:  #바다인 경우
                    sea += 1  #바다양 추가
                elif arr[nx][ny] != 0 and not visited[nx][ny]:  # 빙산이고 아직 방문하지 않은 경우
                    q.append((nx, ny))  
                    visited[nx][ny] = True  # 방문 처리
        if sea > 0:  # 큐를 돌고 난 후 바다의 양 저장
            seaArr.append((x, y, sea))
    
    # 빙산 녹이기
    for x, y, sea in seaArr:  
        arr[x][y] = max(0, arr[x][y] - sea) #음수로 만들지 않기 위해 max 사용
    return 1  # 빙산의 덩어리 개수 반환


#-------------------------------------------------------------------
ice = []  # 빙산의 위치
for i in range(n):
    for j in range(m):
        if arr[i][j] != 0:  # 빙산이 있는 위치
            ice.append((i, j))  # 리스트에 추가
#--------------------------------------------------------------------------------
while ice:  #빙산이 남아있는 동안 반복
    visited = [[0] * m for _ in range(n)]  # 방문 리스트 초기화
    bye = []  # 녹아 없어진 빙산
    cnt = 0  #덩어리 개수 2가 목표치
    
    for i, j in ice:  
        if arr[i][j] and not visited[i][j]:  # 빙산이 있고 아직 방문하지 않은 경우
            cnt += bfs(i, j)  #bfs 실행!
        if arr[i][j] == 0:  # 빙산이 다 녹으면
            bye.append((i, j))  # 리스트에 추가

    if cnt >= 2:  # 빙산이 두 덩어리 이상으로 분리된 경우
        print(year)  #끝
        break
    
    ice = list(set(ice) - set(bye))  # 녹아 없어진 빙산 제거
    ice = sorted(ice)  # 빙산 정렬
    year += 1  # 년수 증가

if cnt < 2:  # 빙산이 한 덩어리인 경우
    print(0)  # 0 출력
