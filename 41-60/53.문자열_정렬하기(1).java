import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String[] a = my_string.replaceAll("[^0-9]", "").trim().split("");
        int[] answer = new int[a.length];
        for(int i =0; i< a.length; i++)
        {
            answer[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(answer);
        return answer;
    }
}

/*
steam 풀이...?

 import java.util.*;

class Solution {
    public int[] solution(String myString) {
        return Arrays.stream(myString.replaceAll("[A-Z|a-z]", "").split("")).sorted().mapToInt(Integer::parseInt).toArray();
    }
}
 */