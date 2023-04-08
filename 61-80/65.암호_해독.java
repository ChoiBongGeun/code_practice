class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i = 1;
        while(cipher.length() >= code*i)
        {
            answer += cipher.charAt(code*i-1)+"";
            i++;
        }
        return answer;
    }
}
/*
class Solution {
    public String solution(String cipher, int code) {
        String answer = "";

        for (int i = code; i <= cipher.length(); i = i + code) {
            answer += cipher.substring(i - 1, i);
        }

        return answer;
    }
}
 */