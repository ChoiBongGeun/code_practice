class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-num1+1];
        int index = 0;
        for(int i = num1; i<num2+1; i++)
        {
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }
}

/*

 Arrays.copyOfRange 공부
 
 import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
 */