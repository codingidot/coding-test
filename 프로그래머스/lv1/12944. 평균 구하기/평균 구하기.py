def solution(arr):
    answer = 0
    sum = 0
    for k in arr:
        sum += k
    answer = sum / len(arr)
    return answer

solution([1,2,3,4])
solution([5,5])
