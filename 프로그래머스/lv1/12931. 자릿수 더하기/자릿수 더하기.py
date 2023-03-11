def solution(n):
    answer = 0
    arr = list(str(n))
    sum = 0
    
    for k in arr:
        sum += int(k)
        
    answer = sum
    
    return answer