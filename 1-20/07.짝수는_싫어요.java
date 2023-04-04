class Solution {
    public int[] solution(int n) {
        if(n%2 ==0)
        {
            int[] answer = new int[n/2];
            int i =0;
            int x = 1;
            while(i<n/2)
            {
                answer[i] = x;
                i++;
                x+=2;
            }
            return answer;
        }
        else
        {
            int[] answer = new int[n/2+1];
                
            int i =0;
            int x = 1;
            while(i<n/2+1)
            {
                answer[i] = x;
                i++;
                x+=2;
            }
            return answer;
        }
    }
}

/*
 import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}

 */