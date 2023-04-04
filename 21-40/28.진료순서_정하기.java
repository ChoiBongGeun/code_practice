import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] sortList= new int[emergency.length];
        for(int i = 0; i< emergency.length; i++)
        {
            sortList[i] = emergency[i];
        }
        Arrays.sort(sortList);
        for(int i = 0; i < emergency.length; i++)
        {
            for(int x =0; i<sortList.length; x++)
            {
                if(emergency[i]==sortList[x])
                {
                    answer[i] =sortList.length-x;
                    break;
                }
            }
        }
        return answer;
    }
}

/*
깊은 복사 얕은 복사 주의

int[] sortList = emergnecy 얕은 복사이므로 sortList를 Arrays.sort 하면 emergency 또한 sort 된다.

Arrays.stream 참고

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] e) {
        return Arrays.stream(e).map(i -> Arrays.stream(e).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).indexOf(i) + 1).toArray();
    }
}
 */