import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer=numbers[numbers.length-1]*numbers[numbers.length-2];
        return answer;
    }
}

/*
선택 정렬 더 빠름
 class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        answer = numbers[numbers.length - 2] * numbers[numbers.length - 1];

        return answer;
    }
}
 */