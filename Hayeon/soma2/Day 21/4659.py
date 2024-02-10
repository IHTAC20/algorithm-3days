import sys
input = sys.stdin.readline

while True:
    mouem = 'aeiou'
    n = input().strip()
    if n == "end":
        break

    cnt = 0  # 모음의 개수
    for i in n:
        if i in 'aeiou':
            cnt += 1

    if cnt == 0:  # 모음이 없는 경우
        print("<" + n + ">" + " is not acceptable.")
        continue

    # 같은 글자가 연속적으로 두번 오는 경우, ee 와 oo는 제외
    for i in range(len(n)-1):
        if n[i] == n[i+1] and n[i] not in 'eo':
            print("<" + n + ">" + " is not acceptable.")
            break
    else:
        # 모음이 3개 혹은 자음이 3개 연속으로 오는 경우
        for i in range(len(n)-2):
            if (n[i] in 'aeiou' and n[i+1] in 'aeiou' and n[i+2] in 'aeiou') or (n[i] not in 'aeiou' and n[i+1] not in 'aeiou' and n[i+2] not in 'aeiou'):
                print("<" + n + ">" + " is not acceptable.")
                break
        else:
            print("<" + n + ">" + " is acceptable.")

#정규식 이용
# import re
# import sys
# input = sys.stdin.readline

# while True:
#     n = input().strip()
#     if n == "end":
#         break

#     if (re.search(r'[aeiou]', n) and
#         not re.search(r'[^aeiou]{3,}|[aeiou]{3,}', n) and
#         not re.search(r'[^eo]{1}\1', n)):
#         print("<" + n + ">" + " is acceptable.")
#     else:
#         print("<" + n + ">" + " is not acceptable.")

