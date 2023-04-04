class Solution {
    public String solution(int age) {
        String answer = "";
        while(age >0)
        {
            char A = (char) (age%10+97);
            answer = A+answer;
            age/=10;
        }
        return answer;
    }
}