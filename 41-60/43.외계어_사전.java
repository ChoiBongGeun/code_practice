class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int count = 0;
        for(String d : dic)
        {
            for(String s : spell)
            {
                if(d.contains(s))
                {
                    count++;
                }
            }
            if(count == spell.length)
            {
                answer = 1;
                break;
            }
            else
            {
                count =0;
            }
        }
        return answer;
    }
}

/*
 import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        return Arrays.stream(dic).map(s -> s.chars().sorted().mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining())).collect(Collectors.toList()).contains(Arrays.stream(spell).sorted().collect(Collectors.joining())) ? 1 : 2;
    }
}
 */ 