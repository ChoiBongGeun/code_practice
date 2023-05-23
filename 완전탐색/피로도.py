import itertools
def solution(k, dungeons):
    answer = -1
    answerList=[]
    kcopy = k
    score = 0;
    dungeonsList = list(itertools.permutations(dungeons,len(dungeons))) # itertools.permutations 모든 경우의 수 구하는 라이브러리 (순열)
    print(dungeonsList[1][2])
    for i in range(0,len(dungeonsList)):
        for j in range(0,len(dungeonsList[i])):
            if kcopy >= dungeonsList[i][j][0]: #k보다 최소 필요 피로도가 적으면 score +1 해주고 피로도에선 소모 피로도만큼 사용
                score +=1
                kcopy -= dungeonsList[i][j][1]            
            else:
                break
        answerList.append(score) #answerList에 넣어 주고 피로도 초기화 및 점수 초기화
        kcopy = k
        score = 0
    print(answerList)
    answer = max(answerList)
    return answer

dungeons = 	[[80,20],[50,40],[30,10]]
k = 80
solution(k,dungeons)