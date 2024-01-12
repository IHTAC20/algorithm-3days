
import sys

input = sys.stdin.readline

n = int(input())

stack = []

for _ in range(n):
    command = input().split()
    if command[0] == "push":
        stack.append(int(command[1]))
    elif command[0] == "pop":
        print(stack.pop() if stack else -1)
    elif command[0] == "size":
        print(len(stack))
    elif command[0] == "empty":
        print(0 if stack else 1)
    elif command[0] == "top":
        print(stack[-1] if stack else -1)

 # print 안 if문
#x = 10
#print("x는 10입니다." if x == 10 else "x는 10이 아닙니다.")
# numbers = [1, 2, 3, 4, 5]
# print([x for x in numbers if x > 3])
        # 3보다 큰 숫자만 출력
