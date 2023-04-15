import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answerList = new ArrayList<>();
        for(int num : numlist)
        {
            if(num % n ==0)
            {
                answerList.add(num);
            }
        }
        int[] answer = answerList.stream()
                .mapToInt(i -> i)
                .toArray();
        return answer;
    }
}
/*
 import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
 */