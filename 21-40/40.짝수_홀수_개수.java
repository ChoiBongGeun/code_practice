class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for(int i : num_list)
        {
            if(i%2==0)
            {
                answer[0]++;
            }
            else
            {
                answer[1]++;
            }
        }
        return answer;
    }
}

/*
굳이..?
 import java.util.stream.IntStream;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}

 */