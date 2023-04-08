class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] stringList = my_string.split("");
        String exString = stringList[num1];
        stringList[num1] = stringList[num2];
        stringList[num2] = exString;
        answer = String.join("",stringList);
        return answer;
    }
}

/*
 import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}
 */