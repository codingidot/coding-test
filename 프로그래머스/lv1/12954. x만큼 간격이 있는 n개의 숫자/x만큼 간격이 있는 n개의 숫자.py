def solution(x, n):
    answer = []
    num1 = x
    for k in range(n):
        answer.append(num1)
        num1 += x
    return answer