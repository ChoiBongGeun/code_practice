import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 2;
        Arrays.sort(sides);
        if(sides[2] - (sides[0]+sides[1]) < 0)
        {
            answer =1;
        }
        
        return answer;
    }
}
/*
속도 문제 생길 시 sort 말고 밑에 처럼 비교 하는 형식으로 풀것
 Arrays.sort 최대 0.48
 밑에 처럼 풀면 최대 0.03
 class Solution {
    public int solution(int[] sides) {
        int A = sides[0] + sides[1];
        int B = sides[1] + sides[2];
        int C = sides[0] + sides[2];

        if(A <= sides[2] || B <= sides[0] || C <= sides[1]) return 2;
        else return 1;
    }
}
Arrays.sort 풀때 삼향 연산자가 이용
import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        return sides[2] >= sides[0]+sides[1] ? 2 : 1;
    }
}
 */