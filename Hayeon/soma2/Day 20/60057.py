


s = "abcabcdede"
def solution(s):
    answer = []
    lent = len(s)
    cnt = 0
    santance = ""
    for i in range(1, lent+1):
        start = s[:i] #시작점
        for j in range(i, lent, i):
            check = s[i:j+i]
            if start == check: #다를 경우 
                cnt += 1
            else : #다를 경우  
                if cnt != 0 and cnt !=1:
                    santance = santance+ cnt + start 
                    start = check[i:j+i]
                    cnt = 0
                else: 
                    santance = santance +  start
                    start = check[i:j+i]
                    cnt = 0
        answer.append(len(santance))

    answer = min(answer)
    print(answer)
    return answer



