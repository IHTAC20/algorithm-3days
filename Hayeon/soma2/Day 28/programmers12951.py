def solution(s):
    arr = list(map(str, s.split(" ")))
    for i in range(len(arr)):
        if arr[i] and arr[i][0].isalpha():
            arr[i] = arr[i][0].upper() + arr[i][1:].lower()
        else:
            arr[i] = arr[i][0:].lower()
    return " ".join(arr)
