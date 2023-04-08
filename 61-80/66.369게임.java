class Solution {
    public int solution(int order) {
        int answer = 0;
        while(order > 0)
        {
            if(order%10 ==3 || order%10 ==6 || order%10 ==9)
            {
                answer++;
            }
            order/=10;
        }
        return answer;
    }
}

/*
 import java.util.Arrays;

class Solution {
    public int solution(int order) {
        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
    }
}
 */