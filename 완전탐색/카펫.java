class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = brown + yellow;
        for(int i =1; i < n+1; i ++)
        {
            if(n%i == 0)
            {
                int a = n/i;
                if((a-2)*(i-2) ==yellow) // 노랑색은 갈색의 가로-2 세로-2이다
                {
                    if(i >a)
                    {
                        answer[0] = i;
                        answer[1] = a;
                    }
                    else
                    {
                        answer[0] = a;
                        answer[1] = i;
                    }
                }
            }
        }
        return answer;
    }
}