import sys
input = sys.stdin.readline

n = int(input())

for _ in range(n):
    arr = input()
    score = 0
    result = 0
    for i in arr:
        if i == "O":
            score += 1
        else:
            score = 0
        result += score
    print(result) 
