class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] list = my_string.split("");
        for(int i = 0; i < list.length; i++)
        {
            for(int x = i+1; x < list.length; x++)
            {
                if(list[x].equals(list[i]))
                {
                    list[x] = "";
                }
            }
        }
        answer = String.join("",list);
        return answer;
    }
}

/*
 import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}

중복되지 않는 set의 특성

import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));

        return String.join("", set);
    }
}
 */