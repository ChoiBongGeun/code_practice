class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++)
        {
            if(Character.isUpperCase(my_string.charAt(i)))
            {
                answer+=(my_string.charAt(i)+"").toLowerCase();
            }
            else
            {
               answer+=(my_string.charAt(i)+"").toUpperCase(); 
            }
        }
        return answer;
    }
}

/*

 import java.util.stream.Collectors;

class Solution {
    public String solution(String myString) {
        return myString.chars().mapToObj(operand -> String.valueOf((char) (Character.isLowerCase(operand) ? Character.toUpperCase(operand) : Character.toLowerCase(operand)))).collect(Collectors.joining());
    }
}

아스키 코드 사용

class Solution {
    public String solution(String s) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122){
                answer += (char)(s.charAt(i)-32);
            } else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                answer += (char)(s.charAt(i)+32);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}
 */