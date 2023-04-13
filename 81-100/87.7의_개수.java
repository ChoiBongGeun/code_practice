class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int x  : array)
        {
            String stringToInt = String.valueOf(x);
            if(stringToInt.contains("7"+""))
            {
                for(int y = 0; y< stringToInt.length(); y++)
                {
                    if((stringToInt.charAt(y)+"").equals("7"+""))
                    {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

/*
stream 풀이
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(
                        Arrays.stream(array)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining())
                                .split("")
                )
                .filter(s -> s.equals("7"))
                .count();
    }
}
 */