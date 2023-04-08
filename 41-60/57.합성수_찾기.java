class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 4; i <= n; i++)
        {
            int count = 0;
            for(int x = 1; x <= i; x++)
            {
                if(i%x==0)
                {
                    count++;
                }
            }
            if(count>2)
            {
                answer++;
            }
        }
        return answer;
    }
}

/*
 
import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n).filter(i -> (int) IntStream.rangeClosed(1, i).filter(i2 -> i % i2 == 0).count() > 2).count();
    }
}

 */