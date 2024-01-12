import sys
input = sys.stdin.readline

circle = []
#톱니바퀴 만들기
for i in range(4):
    circle.append(list(map(int, input())))
    

n = int(input()) #회전수

arr = []
for i in range(n): #톱니바퀴 번호, 방향
    arr.append(list(map(int, input().split())))
    