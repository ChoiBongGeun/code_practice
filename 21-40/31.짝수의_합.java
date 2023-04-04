class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =0; i <= n; i++)
        {
            if(i%2 ==0)
            {
                answer = answer + i;
            }
        }
        return answer;
    }
}
/*
짝수 의 합 이므로 i를 2부터 시작 2씩 증가
 class Solution {
    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }
}
 */