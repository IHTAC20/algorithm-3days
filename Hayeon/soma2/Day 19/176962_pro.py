def solution(plans):
    answer = []

    for i in plans:
        h , m = map(int, i[1].split(':'))
        i[1] = h * 60 + m
        i[2] = int(i[2])
    plans = sorted(plans, key = lambda x: x[1])
    stop = []

    for i in range(len(plans)-1):
        name, time = plans[i][0], plans[i][2] 
        stop.append([name,time])
        #다음 과제까지 
        gap = plans[i+1][1] - plans[i][1] 

        while stop and gap: # ["science" ,10], ["music", "40"]
                            #gap : [0, 30 ] 이렇게되면 전에 못끝낸 거 먼저!
            if gap >= stop[-1][1]: #다음 과제까지 시간이 남는다면
                name, time = stop.pop()
                answer.append(name) #그 과제 완료
                gap -= time #남은 시간 정리
            else:
                stop[-1][1] -= gap #
                gap = 0
                #stop에 과목명、남은 시간 저장되고 종료 

    answer.append(plans[-1][0])

    for i in range(len(stop)):
        answer.append(stop[~i][0])

    return answer
