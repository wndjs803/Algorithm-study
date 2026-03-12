from collections import Counter

def solution(i, j, k):
    answer = 0
    
    for num in range(i, j + 1):
        counter = Counter(str(num))
        answer += counter[str(k)]
        
    return answer
        