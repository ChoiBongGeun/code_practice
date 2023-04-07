class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while(n>=i)
        {
            answer++;
            i*=answer;
            
        }
        return answer-1;
    }
}