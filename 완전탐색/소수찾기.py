import itertools
def solution(numbers):
    answer = 0
    numberlist=[]
    for i in range(1,len(numbers)+1):
        number = list(itertools.permutations(numbers,i)) #1~numbers 자리수만큼 뽑기 [('1',), ('7',)][('1', '7'), ('7', '1')]
        for j in number:
            number = "".join(j)
            numberlist.append(int(number)) # 011과 11을 다르게 판단하여 중복으로 구하기 위해 int로 저장해주었다
    numberlist=list(set(numberlist))
    for i in range(len(numberlist)):
        if primenumber(numberlist[i]):
            answer +=1
        else:
            continue
    return answer
def primenumber(n): #소수 구하는 함수 0,1은 무조건 소수가 아니고 2부터는 자기자신을 제외하고 나눠지는 수가 있는지 확인하였다   
    if n !=1 and n!=0:
        for i in range(2,n):
            if n % i == 0:
                return False
            else:
                continue
    else:
        return False
    return True

numbers = "17"
solution(numbers)