import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        if(array.length !=1)
        {
            Arrays.sort(array);
            for(int i=0; i< array.length; i++)
            {
                if(n <= array[i])
                {
                    if(array[i]-n >=n-array[i-1])
                    {
                        answer = array[i-1];
                        break;
                    }
                    else if(array[i]-n < n-array[i-1])
                    {
                        answer = array[i];
                        break;
                    }
                }
            }
        }
        if(answer == 0)
        {
            answer = array[array.length-1];
        }
        return answer;
    }
}
/*
 import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array, int n) {
        return Math.min(array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).indexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))], array[Arrays.stream(array).map(operand -> Math.abs(n - operand)).boxed().collect(Collectors.toList()).lastIndexOf(Arrays.stream(array).map(operand -> Math.abs(n - operand)).min().orElse(0))]);
    }
}
 */