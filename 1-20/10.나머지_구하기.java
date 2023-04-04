class Solution {
    public int solution(int num1, int num2) {
        int answer = num1%num2;
        return answer;
    }
}
/*
% 보다 while - 조합이 처리 속도가 많은 차이는 아니지만 빠름
%       최대 0.04
while - 최대 0.02

 class Solution {
    public int solution(int num1, int num2) {
        while (num1 >= num2) {
            num1 = num1 - num2;
        }
        int answer = num1;
        return answer;
    }
}
 */