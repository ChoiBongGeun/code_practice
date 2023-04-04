class Solution {
    public int solution(int n) {
        int answer = n/7;
        if(n%7 !=0)
        {
            answer +=1;
        }
        return answer;
    }
}
/*
 class Solution {
    public int solution(int n) {
        return (n + 6) / 7; // 6이 나온 이유는 어떤 수를 7로 나누면 나머지가 0부터 6까지만' 있기 때문
    }
}
 */