import java.util.*;
import java.lang.Integer;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] slist = s.split("");
        HashMap<String, Integer> map = new HashMap<>();
        for(String a : slist)
        {
            if(map.containsKey(a))
            {
                map.put(a,map.get(a)+1);
            }
            else
            {
                map.put(a,1);
            }
        }
        ArrayList answerList = new ArrayList<String> ();
        for(String key : map.keySet())
        {
            if(map.get(key) == 1)
            {
                answerList.add(key);
            }
        }
        Collections.sort(answerList);
        answer = String.join("",answerList);
        return answer;
    }
}

/*
 class Solution {
    public String solution(String s) {
        int[] alpha = new int[26];
        for(char c : s.toCharArray()){
            alpha[c - 'a']++;
        }

        StringBuilder answer = new StringBuilder();
        for(int i = 0; i < 26; i++){
            if(alpha[i] == 1){
                answer.append((char)(i + 'a'));
            }
        }
        return answer.toString();
    }
}
 */