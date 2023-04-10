import java.util.*;
class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Arrays.sort(lines,(a,b)->{
            return a[0]-b[0];
        }); // 첫번째 숫자 기준으로 오름 차순

        for(int i= lines[0][0]; i<= lines[2][1]; i++) //제일 작은 숫자 부터 제일 큰 숫자까지 for문 
        {
            int check = 0;
            if(lines[0][0]<=i && i<lines[0][1]) //첫번째 선이 지나는 선 첫번째 점은 포함하고 마지막 점은 포함 하지 않는 이유는 선분이기 때문이다.
            {
                check++;
            }
            if(lines[1][0]<=i && i<lines[1][1])
            {
                check++;
            }
            if(lines[2][0]<=i && i<lines[2][1])
            {
                check++;
            }
            if(check>1)
            {
                answer++;
            }
        }
        return answer;
    }
}

/*
 Arrays.sort(arr, (o1, o2) -> {
    return o1[0]-o2[0]; // 첫번째 숫자 기준 오름차순
});
 */
