import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int before = arr[0];
        answerList.add(arr[0]);
        for(int i = 1; i < arr.length; i++)
        {
            if( arr[i] != before)
            {
                answerList.add(arr[i]);
                before = arr[i];
            }
        }
        int[] answer = answerList.stream().mapToInt(i->i).toArray();
        return answer;
    }
}