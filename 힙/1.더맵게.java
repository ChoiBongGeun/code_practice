import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(); // 우선순위 큐
        //우선순위 큐 집어 넣기
        for (int a : scoville) 
        {
            priorityQueue.add(a);
        }
        while(true)
        {
            int first = priorityQueue.peek(); //제일 작은 수 
            //제일 작은수가 k 이상이면 break
            if(first >=K)
            {
                break;
            }
            //위에서 제일 작은수를 비교 했으므로 사이즈가 1이하이고 제일 작은수가 K 이하이면 answer-1 하고 break
            else if(priorityQueue.size() <=1 && first < K )
            {
                answer = -1;
                break;
            }
            //제일 작은수 그리고 그다음 작은수*2 더한 다음 우선순위 큐에 넣어주고 answer++
            priorityQueue.add(priorityQueue.poll() + priorityQueue.poll()*2);
            answer++;
        }
        
        return answer;
    }
}

