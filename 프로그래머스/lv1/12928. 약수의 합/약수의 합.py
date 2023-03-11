def solution(n):
    sum = 0
    num = 0
    if n == 1:
        num = 2
    else:
        num = n
        
    for k in range(1, num):
        if n % k == 0 and k < (n / k):
            sum += k
            sum += int(n / k)
        
        if n % k == 0 and k == (n / k):
            sum += k   
    
    
    answer = sum
    return answer

