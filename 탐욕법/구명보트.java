import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 몸무게 순으로 정렬
        int i =people.length-1;
        int j = 0;
        while( i >=j)
        {
            answer ++;
            if(people[i] + people[j] > limit) //제일 큰 사람과 제일 작은 사람 더했는데 limit 보다 크면 제일 큰사람만 출발
            {
                i--;
            }
            else 
            {
                i--;
                j++;
            }
        }
        
        return answer;
    }
}