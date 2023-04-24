class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int max = 0;
        int index=0;
        for(int i = 0; i < array.length; i++)
        {
            if(max < array[i])
            {
                max = array[i];
                index = i;
            }
        }
        answer[0]= max;
        answer[1]=index;
        return answer;
    }
}

/*
 import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] array) {
        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
        int max = list.stream().max(Integer::compareTo).orElse(0);
        int index = list.indexOf(max);
        return new int[] {max, index};
    }
}
 */