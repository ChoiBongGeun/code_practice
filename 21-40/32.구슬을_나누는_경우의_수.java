class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        long n =1;
        long m = 1;
        for(int i =balls; i > balls-share+1; i--)
        {
            n =i * n;
        }
        
        for(int i = 1; i<=balls-share; i++)
        {
            m = i*m;
        }
        long A = n/m;
        answer = (int)A;
        return answer;
    }
}