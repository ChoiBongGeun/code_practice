class Solution {
    public int solution(int num, int k) {
        String stringToInt = String.valueOf(num);
        int answer = stringToInt.indexOf(k+"")+1;
        if(answer ==0)
        {
            answer = -1;
        }
        return answer;
    }
}
/*
 class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(String.valueOf(k));
    }
}
 */