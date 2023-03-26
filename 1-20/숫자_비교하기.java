class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        if(num1 == num2){ // num1, num2가 같을때만 1
            answer = 1;
        }
        return answer;
    }
}
/*
삼향 연산자의 풀이
class Solution {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
}
 */