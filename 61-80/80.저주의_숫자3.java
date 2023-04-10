import java.util.*;
class Solution {
    public int solution(int n) {
     int answer = 0;
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        int res =1;
        for(int i =1; i< 101; i++)
        {
            while(true)
            {
                String x3String = String.valueOf(res);
                if(!x3String.contains("3"))
                {
                    if(res%3!=0)
                    {
                        x3.add(res);
                        res++;
                        break;
                    }
                }
                res++;
            }
        }
        answer = x3.get(n-1);
        return answer;
    }
}
/*
 class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                i--;
            }
        }

        return answer;
    }
}
 */