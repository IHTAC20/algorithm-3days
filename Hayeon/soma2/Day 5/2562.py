import sys
input = sys.stdin.readline

arr = []
for _ in range(9):
    arr.append(int(input()))
answer = max(arr)
print(answer)  # 가장 큰 수 출력
print(arr.index(answer) + 1)  # 가장 큰 수의 위치 출력 (인덱스 + 1)
