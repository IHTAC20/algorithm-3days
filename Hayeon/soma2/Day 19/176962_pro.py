def solution(plans):
    stack = []
    answer = []

    for i in range(len(plans)):
        h, m = map(int, plans[i][1].split(':')) 
        plans[i][1] = h*60 + m
        plans[i][2] = int(plans[i][2])

    plans.sort(key=lambda x: x[1])

    for i in range(len(plans)-1):
        stack.append([plans[i][0], plans[i][2]])
        gap = plans[i+1][1] - plans[i][1]

        while stack and gap:
            nowTime = stack[-1][1] # 현재 과제의 소요시간
            
            if nowTime <= gap: # 현재 과제의 소요시간이 다음 과제와의 시간차이보다 작다면! (다음과제 시간 전까지 끝낼 수 있다면) 
                name, time = stack.pop() # 스택에서 제거
                gap -= time # 다음과제까지 남은 시간으로 계산
                answer.append(name) # 과제완료!
            else: # 다음 과제시간까지 못 끝내면
                nowTime -= gap # 남은 과제 시간 저장  
                gap = 0 # 다음과제 해야하니까 0

    answer.append(plans[-1][0])

    for i in range(len(stack)):
        answer.append(stack[~i][0])

    return answer
