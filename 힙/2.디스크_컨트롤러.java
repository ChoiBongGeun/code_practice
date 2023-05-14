import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int n = jobs.length;
        PriorityQueue<int[]> PriorityQueue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        List<int[]> jobList = new ArrayList<>();
        Arrays.sort(jobs, (o1, o2) -> o1[1] - o2[1]); // 작업 걸리는 순으로 정렬
        // remove를 위한 List에 넣기
        for(int[] i : jobs)
        {
            jobList.add(i);
        }
        while(n !=0) //작업이 다 끝나면 break
        {
            for(int i = 0; i < jobList.size(); i++) // 작업 걸리는 순으로 정렬 했지만 시간이 너무 오래 걸리면 그다음 작게 걸리는 순으로 먼저 시작
            {
                if(jobList.get(i)[0] <= time)
                {
                    time += jobList.get(i)[1]; //0초부터 작업 끝난 시간까지 걸린시간
                    answer += time - jobList.get(i)[0]; //answer에 작업 들어온 요청 들어온 시간 부터 작업이 끝난 시간 까지 걸린 시간
                    jobList.remove(i);//작업리스트에서 제거
                    n--; // 작업 -1
                    break;//for문 더 돌릴 필요 없으니 break
                }
                else if(i == jobList.size()-1) // 끝까지 됬는데 만약 시간이 같거나 작은것이 없었다면 시간을 1늘려준다
                {
                    time++;
                }
            }
        }
        answer /=jobs.length;
        return answer;
    }
}

/* 
def solution(jobs):
    answer = 0
    time= 0
    n = len(jobs) #나중에 평균을 구하기 위해 전체 몇개가 존재한지 저장해준다
    jobs.sort(key=lambda x: x[1])#소요되는 시간으로 정렬시킨다
    while True:
        if len(jobs) ==0: #pop을 통해 언제 break할지를 정해준다
            break
        else:
            for i in range(len(jobs)):
                if jobs[i][0] <= time: #소요시간이 작은되로 정렬했으니 만약 시간이 같거나 작은 것이 있으면 바로 넣어준다
                    time += jobs[i][1]
                    answer += time - jobs[i][0]
                    jobs.pop(i)
                    break
                elif i == len(jobs) - 1:#끝까지 됬는데 만약 시간이 같거나 작은것이 없었다면 시간을 1늘려준다
                    time +=1
                else:
                    continue

    answer = answer //n
    return answer
*/