

#2020 KAKAO BLIND RECRUITMENT 프로그래머스 문자열 압축
# def solution(s):
#     result=[]
#     길이 = len(s)
#     for i in range(1, 길이+1): #1부터 문자열 끝까지
#         b = ''
#         cnt = 1
#         word =s[:i]
#         for next in range(i, 길이+i, i):
#             if word ==s[next:i+next]:
#                 cnt+=1
#             else:
#                 if cnt != 1: #다른 문자가 나왔다면 
#                     b = str( b + str(cnt) + word) #2ab형태로 만든다
#                 else: #자른 게 다르다면
#                     b += word #abcdef 숫자없이
#                 word = s[next:next+i] #문자열 다시 초기화하고 종료  
#                 cnt = 1
#         result.append(len(b))
#     return min(result)


def solution(s):
    answer = []
    lent = len(s)

    for i in range(1, lent+1 ):
        start = s[:i] #시작점
        cnt = 1
        santance = ""
#len+i까지 도는 이유
# acacac를 2칸씩 나누었을때 i를 추가하지 않으면 끝까지 문자열 계산을 하지 않는다  
#i를 추가함으로써 for문 안의 else 문이 마지막에 무조건 실행된다
        for j in range(i, lent + i, i):
            check = s[j:j+i]
            if start == check:  
                cnt += 1
            else : #다를 경우 
                if cnt > 1:
                    santance = santance+ str(cnt) + start
                else: 
                    santance = santance + start
                start = check
                cnt = 1
        answer.append(len(santance))

    answer = min(answer)
    print(answer)
    return answer





