class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = my_string.length()-1; i >= 0; i --){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
 /*
 stringBuilder 사용 시간 더 빠름
  class Solution {
    public String solution(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
}
  */