import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        if(numbers[0]*numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2])
        {
            return numbers[0]*numbers[1]; 
        }
        else
        {
            return numbers[numbers.length-1]*numbers[numbers.length-2];
        }
    }
}

/*
Math.max 사용 풀이

import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int len = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[len - 2] * numbers[len - 1]);
    }
}

 */