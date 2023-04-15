import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int i = 1 ; i <= n; i++)
        {
            if(n %i ==0)
            {
                answerList.add(i);
            }
        }
        
        int[] answer = answerList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
/*
import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
    }
}
 */