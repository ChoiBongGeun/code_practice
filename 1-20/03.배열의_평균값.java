class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        for(int i : numbers)
        {
            answer += i;
        }
        answer = answer/numbers.length;
        return answer;
    }
}
/*
arrays.stream을 많이 사용한다고 하니 알아 둘것
 import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
 */