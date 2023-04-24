class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i = 0; i < s1.length; i++)
        {
            for(int j = 0; j < s2.length; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    answer++;
                }
            }
        }
        return answer;
    }
}
/*
 import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] s1, String[] s2) {
        return (int) Arrays.stream(s1).map(s -> Arrays.stream(s2).collect(Collectors.toList()).contains(s)).filter(b -> b).count();
    }
}
 */