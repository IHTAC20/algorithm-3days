n = 5
snow =  [1,3,7,2,9]
def sol(n, snow):
    answer = []
    arr = []
    for i in range(n*2):
        if (i % 2)  == 1:
            arr.append(i)
    for i in range(n):
        if snow[i] == arr[i]:
            answer.append(snow[i])
        elif snow[i] > arr[i]:
            snow[i+1] += snow[i] - arr[i]
            answer.append(arr[i])
        elif snow[i] < arr[i]:
            
            answer.append(snow[i])
    return answer    

print(sol(n,snow))

# 1,3,5,4,9