class Solution {
    public String[] solution(String my_str, int n) {
        int len = 0;
        if(my_str.length() % n ==0)
        {
            len = my_str.length()/n;
        }
        else
        {
            len = my_str.length()/n+1;
        }
        String[] answer = new String[len];
        for(int i =0; i < len; i++)
        {
            answer[i] = my_str.substring(i*n,(i+1)*n > my_str.length() ? 
                                         my_str.length() : (i+1)*n);
        }
        return answer;
    }
}

/*
stream 풀이
import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String myStr, int n) {
        return IntStream.range(0, myStr.length() / n + (myStr.length() % n > 0 ? 1 : 0))
                .mapToObj(i -> i == myStr.length() / n ? myStr.substring(i * n) : myStr.substring(i * n, (i + 1) * n))
                .toArray(String[]::new);
    }
}
 */